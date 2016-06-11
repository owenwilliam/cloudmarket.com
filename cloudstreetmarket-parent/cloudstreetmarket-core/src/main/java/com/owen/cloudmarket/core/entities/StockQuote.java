package com.owen.cloudmarket.core.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Entity
// 生成一张名为stock_quote的表，但是还有参数是从父类中继承
@Table(name = "stock_quote")
public class StockQuote extends Quote implements Serializable
{

	private static final long serialVersionUID = -8175317254623555447L;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "stock_code")
	private StockProduct stock;

	private double bid;

	private double ask;

	public StockProduct getStock()
	{
		return stock;
	}

	public void setStock(StockProduct stock)
	{
		this.stock = stock;
	}

	public double getBid()
	{
		return bid;
	}

	public void setBid(double bid)
	{
		this.bid = bid;
	}

	public double getAsk()
	{
		return ask;
	}

	public void setAsk(double ask)
	{
		this.ask = ask;
	}

}
