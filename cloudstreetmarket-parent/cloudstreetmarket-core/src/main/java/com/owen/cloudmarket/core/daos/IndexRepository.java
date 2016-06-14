package com.owen.cloudmarket.core.daos;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.owen.cloudmarket.core.entities.Index;
import com.owen.cloudmarket.core.entities.Market;
import com.owen.cloudmarket.core.enums.MarketCode;

/**
 * 接口
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public interface IndexRepository
{
	/**
	 * 查找市场
	 * 
	 * @param market
	 * @return
	 */
	List<Index> findByMarket(Market market);

	/**
	 * 查找市场 分页
	 * 
	 * @param market
	 * @param pageable
	 * @return
	 */
	Page<Index> findByMarket(Market market, Pageable pageable);

	/**
	 * 查找所有
	 * 
	 * @return
	 */
	List<Index> findAll();

	/**
	 * 查找所有 分页
	 * 
	 * @param pageable
	 * @return
	 */
	Page<Index> findAll(Pageable pageable);

	/**
	 * 通过marketCode 来查找
	 * 
	 * @param code
	 * @return
	 */
	Index findByCode(MarketCode code);
}
