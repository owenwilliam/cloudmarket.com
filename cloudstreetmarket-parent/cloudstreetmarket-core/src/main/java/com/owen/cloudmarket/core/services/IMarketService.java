package com.owen.cloudmarket.core.services;

import java.util.List;


import com.owen.cloudmarket.core.dtos.DailyMarketActivityDTO;
import com.owen.cloudmarket.core.dtos.MarketOverviewDTO;

public interface IMarketService
{
	DailyMarketActivityDTO getLastDayMarketActivity(String string);
	List<MarketOverviewDTO> getLastDayMarketsOverview();
}
