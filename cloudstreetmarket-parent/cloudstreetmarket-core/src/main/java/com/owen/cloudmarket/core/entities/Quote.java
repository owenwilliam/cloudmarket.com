package com.owen.cloudmarket.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * 报价
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Quote
{

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected Integer id;

	private Date date;

	private double open;

	@Column(name = "previous_close")
	private double previousClose;

	private double last;

	private double high;

	public double getHigh()
	{
		return high;
	}

	public void setHigh(double high)
	{
		this.high = high;
	}

	public double getLow()
	{
		return low;
	}

	public void setLow(double low)
	{
		this.low = low;
	}

	private double low;

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public double getOpen()
	{
		return open;
	}

	public void setOpen(double open)
	{
		this.open = open;
	}

	public double getPreviousClose()
	{
		return previousClose;
	}

	public void setPreviousClose(double previousClose)
	{
		this.previousClose = previousClose;
	}

	public double getLast()
	{
		return last;
	}

	public void setLast(double last)
	{
		this.last = last;
	}

	public Date getDate()
	{
		return date;
	}

	public void setDate(Date date)
	{
		this.date = date;
	}

}
