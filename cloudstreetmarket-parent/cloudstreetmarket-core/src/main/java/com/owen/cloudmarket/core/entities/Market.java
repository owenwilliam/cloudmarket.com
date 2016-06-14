package com.owen.cloudmarket.core.entities;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.owen.cloudmarket.core.enums.MarketCode;

/**
 * 市场
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
@Entity
@Table(name = "market")
public class Market implements Serializable
{

	private static final long serialVersionUID = -6433721069248439324L;

	@Id
	@Enumerated(EnumType.STRING)
	private MarketCode code;

	private String name;

	@OneToMany(mappedBy = "market", cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	private Set<Index> indices = new LinkedHashSet<>();

	public MarketCode getCode()
	{
		return code;
	}

	public void setCode(MarketCode code)
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

	public Set<Index> getIndices()
	{
		return indices;
	}

	public void setIndices(Set<Index> indices)
	{
		this.indices = indices;
	}

}
