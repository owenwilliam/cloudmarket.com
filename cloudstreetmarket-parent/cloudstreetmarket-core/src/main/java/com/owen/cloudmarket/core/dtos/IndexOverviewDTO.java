package com.owen.cloudmarket.core.dtos;

import java.math.BigDecimal;
import java.util.Date;

//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import com.owen.cloudmarket.core.entities.Index;
import com.owen.cloudmarket.core.enums.MarketCode;
import com.owen.cloudmarket.core.enums.QuotesInterval;

/**
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version 3.x.x
 *
 */
public class IndexOverviewDTO
{

	private static final long serialVersionUID = 1L;

	private String code;
	private String name;
	private String market;
	private BigDecimal latestValue;
	private BigDecimal latestChange;
	private BigDecimal latestChangePercent;
	private BigDecimal prevClose;
	private BigDecimal high;
	private BigDecimal low;

	public IndexOverviewDTO(String code, String name, String market,
			BigDecimal latestValue, BigDecimal latestChange,
			BigDecimal latestChangePercent, BigDecimal prevClose,
			BigDecimal high, BigDecimal low)
	{

		this.code = code;
		this.name = name;
		this.market = market;
		this.latestValue = latestValue;
		this.latestChange = latestChange;
		this.latestChangePercent = latestChangePercent;
		this.prevClose = prevClose;
		this.high = high;
		this.low = low;
	}

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public BigDecimal getLatestValue()
	{
		return latestValue;
	}

	public void setLatestValue(BigDecimal latestValue)
	{
		this.latestValue = latestValue;
	}

	public BigDecimal getLatestChange()
	{
		return latestChange;
	}

	public void setLatestChange(BigDecimal latestChange)
	{
		this.latestChange = latestChange;
	}

	public String getMarket()
	{
		return market;
	}

	public void setMarket(String market)
	{
		this.market = market;
	}

	public BigDecimal getLatestChangePercent()
	{
		return latestChangePercent;
	}

	public void setLatestChangePercent(BigDecimal latestChangePercent)
	{
		this.latestChangePercent = latestChangePercent;
	}

	public BigDecimal getPrevClose()
	{
		return prevClose;
	}

	public void setPrevClose(BigDecimal prevClose)
	{
		this.prevClose = prevClose;
	}

	public BigDecimal getHigh()
	{
		return high;
	}

	public void setHigh(BigDecimal high)
	{
		this.high = high;
	}

	public BigDecimal getLow()
	{
		return low;
	}

	public void setLow(BigDecimal low)
	{
		this.low = low;
	}

	public static IndexOverviewDTO build(Index index)
	{
		return new IndexOverviewDTO(index.getName(), index.getCode(), index
				.getMarket().getCode().name(), index.getDailyLatestValue(),
				index.getDailyLatestChange(),
				index.getDailyLatestChangePercent(), index.getPreviousClose(),
				index.getHigh(), index.getLow());
	}

}