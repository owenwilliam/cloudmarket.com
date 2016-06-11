package com.owen.cloudmarket.core.dtos;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

/**
 * 当天市场情况
 * 
 * @author OwenWilliam 2016-6-10
 * @since
 * @version v2.x.x
 *
 */
public class DailyMarketActivityDTO
{
	String marketShortName; // 市场简称
	String marketId; // 市场编号
	Map<String, BigDecimal> values;
	Date dateSnapshot;

	public DailyMarketActivityDTO(String marketShortName, String marketId,
			Map<String, BigDecimal> values, Date dateSnapshot)
	{
		super();
		this.marketShortName = marketShortName;
		this.marketId = marketId;
		this.values = values;
		this.dateSnapshot = dateSnapshot;
	}

	public String getMarketShortName()
	{
		return marketShortName;
	}

	public void setMarketShortName(String marketShortName)
	{
		this.marketShortName = marketShortName;
	}

	public String getMarketId()
	{
		return marketId;
	}

	public void setMarketId(String marketId)
	{
		this.marketId = marketId;
	}

	public Map<String, BigDecimal> getValues()
	{
		return values;
	}

	public void setValues(Map<String, BigDecimal> values)
	{
		this.values = values;
	}

	public Date getDateSnapshot()
	{
		return dateSnapshot;
	}

	public void setDateSnapshot(Date dateSnapshot)
	{
		this.dateSnapshot = dateSnapshot;
	}

	public BigDecimal getMaxValue()
	{
		return Collections.max(values.values());
	}

	public BigDecimal getMinValue()
	{
		return Collections.min(values.values());
	}

}
