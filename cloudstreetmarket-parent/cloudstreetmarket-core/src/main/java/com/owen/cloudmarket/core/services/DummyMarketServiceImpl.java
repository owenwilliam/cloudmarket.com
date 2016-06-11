package com.owen.cloudmarket.core.services;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.owen.cloudmarket.core.dtos.DailyMarketActivityDTO;
import com.owen.cloudmarket.core.dtos.IndexOverviewDTO;
import com.owen.cloudmarket.core.dtos.MarketOverviewDTO;

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
	private DateTimeFormatter formatter = DateTimeFormatter
			.ofPattern("yyyy-MM-dd HH:mm");

	@Override
	public DailyMarketActivityDTO getLastDayIndexActivity(String code)
	{
		Map<String, BigDecimal> map = new HashMap<>();
		map.put("08:00", new BigDecimal(9523));
		map.put("08:30", new BigDecimal(9556));
		map.put("09:00", new BigDecimal(9521));
		map.put("09:30", new BigDecimal(9523));
		map.put("10:00", new BigDecimal(9519));
		map.put("10:30", new BigDecimal(9550));
		map.put("11:00", new BigDecimal(9545));
		map.put("11:30", new BigDecimal(9560));
		map.put("12:00", new BigDecimal(9563));
		map.put("12:30", new BigDecimal(9559));
		map.put("13:00", new BigDecimal(9568));
		map.put("13:30", new BigDecimal(9572));
		map.put("14:00", new BigDecimal(9569));
		map.put("14:30", new BigDecimal(9523));
		map.put("15:00", new BigDecimal(9520));
		map.put("15:30", new BigDecimal(9521));
		map.put("16:00", new BigDecimal(9502));
		map.put("16:30", new BigDecimal(9498));
		map.put("17:00", new BigDecimal(9500));
		map.put("17:30", new BigDecimal(9500));
		LocalDateTime ldt = LocalDateTime.parse("2015-04-10 17:30", formatter);

		return new DailyMarketActivityDTO("DAX 30", "GDAXI", map, Date.from(ldt
				.toInstant(ZoneOffset.UTC)));
	}

	@Override
	public List<IndexOverviewDTO> getLastDayIndexOverview(String market)
	{

		List<IndexOverviewDTO> result = Arrays.asList(new IndexOverviewDTO(
				"Dow Jones-IA", "DJI", new BigDecimal(17634.74),
				new BigDecimal(0.1805)), new IndexOverviewDTO("S&P 500",
				"SP500", new BigDecimal(2039.82), new BigDecimal(0.0049)),
				new IndexOverviewDTO("FTSE MIB", "FTSMIB", new BigDecimal(
						18965.41), new BigDecimal(-1.8286)),
				new IndexOverviewDTO("DAX30", "DAX30", new BigDecimal(9252.94),
						new BigDecimal(0.0443)), new IndexOverviewDTO(
						"Eurostoxx 50", "ES50", new BigDecimal(3059.99),
						new BigDecimal(-0.0319)), new IndexOverviewDTO(
						"CAC 40", "FCHI", new BigDecimal(4202.46),
						new BigDecimal(-0.1451)));

		return result;
	}

}
