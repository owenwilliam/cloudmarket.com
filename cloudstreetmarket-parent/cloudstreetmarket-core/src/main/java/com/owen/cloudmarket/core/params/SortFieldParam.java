package com.owen.cloudmarket.core.params;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public class SortFieldParam
{

	List<String> fields;

	public SortFieldParam(String arg)
	{
		this.fields = Arrays.asList(arg.split("#"));
	}

	public List<String> getFields()
	{
		return fields;
	}
}
