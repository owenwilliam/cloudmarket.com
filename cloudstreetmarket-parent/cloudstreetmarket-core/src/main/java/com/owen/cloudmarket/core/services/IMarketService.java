package com.owen.cloudmarket.core.services;

import java.util.List;

import com.owen.cloudmarket.core.dtos.DailyMarketActivityDTO;
import com.owen.cloudmarket.core.dtos.IndexOverviewDTO;

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
	DailyMarketActivityDTO getLastDayIndexActivity(String code);

	/**
	 * 最近查看
	 * 
	 * @param market
	 * @return
	 */
	List<IndexOverviewDTO> getLastDayIndexOverview(String market);
}
