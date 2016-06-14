package com.owen.cloudmarket.core.daos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.owen.cloudmarket.core.entities.Index;
import com.owen.cloudmarket.core.entities.Market;
import com.owen.cloudmarket.core.enums.MarketCode;

/**
 * 用于API
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version 4.x.x
 *
 */
public interface IndexRepositoryJpa extends JpaRepository<Index, String>
{

	List<Index> findByMarket(Market market);

	Page<Index> findByMarket(Market market, Pageable pageable);

	List<Index> findAll();

	Page<Index> findAll(Pageable pageable);

	Index findByCode(MarketCode code);

}
