package com.owen.cloudmarket.core.services;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.owen.cloudmarket.core.dtos.HistoProductDTO;
import com.owen.cloudmarket.core.dtos.IndexOverviewDTO;
import com.owen.cloudmarket.core.enums.MarketCode;
import com.owen.cloudmarket.core.enums.QuotesInterval;

/**
 * 市场逻辑处理
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
public interface IMarketService
{
	/**
	 * 最近活动
	 * 
	 * @param code
	 * @return
	 */
	Page<IndexOverviewDTO> getLastDayIndicesOverview(MarketCode market, Pageable pageable);

	/**
	 * 最近查看
	 * 
	 * @param market
	 * @return
	 */
	
	Page<IndexOverviewDTO> getLastDayIndicesOverview(Pageable pageable);
	
	HistoProductDTO getHistoIndex(String code, MarketCode market, Date fromDate, Date toDate, QuotesInterval interval);
}
