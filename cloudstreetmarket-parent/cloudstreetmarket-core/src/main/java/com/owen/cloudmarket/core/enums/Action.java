package com.owen.cloudmarket.core.enums;

/**
 * 用户行为
 * 
 * @author OwenWilliam 2016-6-10
 * @since
 * @version v2.x.x
 *
 */
public enum Action
{
	BUY("buys"), SELL("sells");

	private String presentTense;

	Action(String present)
	{
		presentTense = present;
	}

	public String getPresentTense()
	{
		return presentTense;
	}
}
