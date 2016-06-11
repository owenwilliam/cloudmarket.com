package com.owen.cloudmarket.core.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.owen.cloudmarket.core.entities.Market;

/**
 * 市场仓库
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
public interface MarketRepository extends JpaRepository<Market, String>
{

}
