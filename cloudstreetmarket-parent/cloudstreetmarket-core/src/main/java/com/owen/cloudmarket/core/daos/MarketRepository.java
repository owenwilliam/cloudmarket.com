package com.owen.cloudmarket.core.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.owen.cloudmarket.core.entities.Market;
import com.owen.cloudmarket.core.enums.MarketCode;

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

	Market findByCode(MarketCode code);
	@Override
	public <S extends Market> List<S> save(Iterable<S> entities);
}
