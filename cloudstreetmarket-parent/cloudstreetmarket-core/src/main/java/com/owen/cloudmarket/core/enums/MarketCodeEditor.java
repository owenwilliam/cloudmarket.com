package com.owen.cloudmarket.core.enums;

import java.beans.PropertyEditorSupport;

/**
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public class MarketCodeEditor extends PropertyEditorSupport
{
	public void setAsText(String text)
	{
		try
		{
			setValue(MarketCode.valueOf(text));
		} catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException(
					"The provided value for the market code variable is invalid!");
		}
	}
}
