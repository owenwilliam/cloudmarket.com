package com.owen.cloudmarket.core.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.owen.cloudmarket.core.entities.Index;
import com.owen.cloudmarket.core.entities.Market;

/**
 * 查找产品
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
public interface IndexProductRepository extends JpaRepository<Index, String>
{

	/**
	 * 查找市场
	 * 
	 * @param market
	 * @return
	 */
	List<Index> findByMarket(Market market);

	/**
	 * 查找交易码
	 * 
	 * @param code
	 * @return
	 */
	Index findByCode(String code);

}
