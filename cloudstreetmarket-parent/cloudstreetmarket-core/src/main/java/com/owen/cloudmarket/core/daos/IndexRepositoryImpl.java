package com.owen.cloudmarket.core.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.owen.cloudmarket.core.entities.Index;
import com.owen.cloudmarket.core.entities.Market;
import com.owen.cloudmarket.core.enums.MarketCode;

/**
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */

@Repository
public class IndexRepositoryImpl implements IndexRepository{

	@PersistenceContext 
	private EntityManager em;
	
	@Autowired
	private IndexRepositoryJpa repo;

	@Override
	public List<Index> findByMarket(Market market) {
		return repo.findByMarket(market);
	}
	
	@Override
	public Page<Index> findByMarket(Market market, Pageable pageable) {
		return repo.findByMarket(market, pageable);
	}

	@Override
	public Index findByCode(MarketCode code) {
		return repo.findByCode(code);
	}

	@Override
	public List<Index> findAll() {
		return repo.findAll();
	}

	@Override
	public Page<Index> findAll(Pageable pageable) {
		return repo.findAll(pageable);
	}

}
