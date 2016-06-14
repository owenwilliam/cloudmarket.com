package com.owen.cloudmarket.core.services;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.owen.cloudmarket.core.dtos.HistoProductDTO;
import com.owen.cloudmarket.core.dtos.IndexOverviewDTO;
import com.owen.cloudmarket.core.enums.MarketCode;
import com.owen.cloudmarket.core.enums.QuotesInterval;

/**
 * 逻辑处理市场实体，获取需要的信息，接口
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Service
public class DummyMarketServiceImpl implements IMarketService
{

	@Override
	public Page<IndexOverviewDTO> getLastDayIndicesOverview(MarketCode market,
			Pageable pageable)
	{
		return null;
	}

	@Override
	public Page<IndexOverviewDTO> getLastDayIndicesOverview(Pageable pageable)
	{
		return null;
	}

	@Override
	public HistoProductDTO getHistoIndex(String code, MarketCode market,
			Date fromDate, Date toDate, QuotesInterval interval)
	{
		return null;
	}

}
