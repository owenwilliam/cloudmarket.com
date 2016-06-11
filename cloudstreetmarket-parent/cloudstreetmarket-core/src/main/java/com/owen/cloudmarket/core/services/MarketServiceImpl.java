package com.owen.cloudmarket.core.services;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owen.cloudmarket.core.daos.HistoricalIndexRepository;
import com.owen.cloudmarket.core.daos.IndexProductRepository;
import com.owen.cloudmarket.core.daos.MarketRepository;
import com.owen.cloudmarket.core.dtos.DailyMarketActivityDTO;
import com.owen.cloudmarket.core.dtos.IndexOverviewDTO;
import com.owen.cloudmarket.core.entities.HistoricalIndex;
import com.owen.cloudmarket.core.entities.Market;

/**
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */

@Service(value = "marketServiceImpl")
public class MarketServiceImpl implements IMarketService
{

	private DateFormat dateFormat = new SimpleDateFormat("HH:mm");

	@Autowired
	private MarketRepository marketRepository;

	@Autowired
	private HistoricalIndexRepository historicalIndexRepository;

	@Autowired
	private IndexProductRepository indexProductRepository;

	@Override
	public DailyMarketActivityDTO getLastDayIndexActivity(String code)
	{
		Map<String, BigDecimal> map = new LinkedHashMap<>();
		Iterator<HistoricalIndex> histoList = historicalIndexRepository
				.findLastIntraDay(code).iterator();
		Date lastDate = null;
		HistoricalIndex lastValue = null;

		while (histoList.hasNext())
		{
			lastValue = histoList.next();
			lastDate = lastValue.getToDate();
			map.put(dateFormat.format(lastDate),
					new BigDecimal(lastValue.getClose()));
		}

		return new DailyMarketActivityDTO(lastValue.getIndex().getName(), code,
				map, lastDate);
	}

	@Override
	public List<IndexOverviewDTO> getLastDayIndexOverview(String market)
	{

		List<IndexOverviewDTO> result = new LinkedList<IndexOverviewDTO>();
		Market marketEntity = marketRepository.findOne(market);

		if (marketEntity != null)
		{
			indexProductRepository
					.findByMarket(marketEntity)
					.forEach(
							index -> {
								HistoricalIndex histo = historicalIndexRepository
										.findLastHistoric(index.getCode());
								result.add(new IndexOverviewDTO(
										index.getName(),
										index.getCode(),
										new BigDecimal(histo.getClose()),
										new BigDecimal(
												histo.getChangePercent() * 0.01)));
							});
		}

		return result;
	}

}
