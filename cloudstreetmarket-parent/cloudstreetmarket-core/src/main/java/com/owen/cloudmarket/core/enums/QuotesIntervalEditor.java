package com.owen.cloudmarket.core.enums;

import java.beans.PropertyEditorSupport;

/**
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public class QuotesIntervalEditor extends PropertyEditorSupport
{
	public void setAsText(String text)
	{
		try
		{
			setValue(QuotesInterval.valueOf(text));
		} catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException(
					"The provided value for the quote-interval variable is invalid!");
		}
	}
}
