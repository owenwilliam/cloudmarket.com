package com.owen.cloudmarket.core.daos;

import java.util.Date;

import com.owen.cloudmarket.core.entities.HistoricalIndex;
import com.owen.cloudmarket.core.enums.MarketCode;
import com.owen.cloudmarket.core.enums.QuotesInterval;

/**
 * 历史记录
 * 
 * @author OwenWilliam 2016-6-11
 * 
 * @since
 * 
 * @version v3.x.x
 *
 */

public interface HistoricalIndexRepository
{
	/**
	 * 查找交易时间
	 * 
	 * @param code
	 * @param of
	 * @return
	 */
	Iterable<HistoricalIndex> findIntraDay(String code, Date of);

	/**
	 * 查找最近的交易
	 * 
	 * @param code
	 * @return
	 */
	Iterable<HistoricalIndex> findLastIntraDay(String code);

	/**
	 * 查找过去历史记录
	 * 
	 * @param code
	 * @return
	 */
	HistoricalIndex findLastHistoric(String code);

	/**
	 * 查找过去历史记录
	 * 
	 * @param code
	 * @param market
	 * @param fromDate
	 * @param toDate
	 * @param interval
	 * @return
	 */
	Iterable<HistoricalIndex> findHistoric(String code, MarketCode market,
			Date fromDate, Date toDate, QuotesInterval interval);

}
