package com.owen.util;

/**
 * 公用 ：错误处理
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public class ExceptionUtil
{

	public static String getRootMessage(Throwable throwable)
	{
		if (throwable == null)
		{
			return null;
		}
		String error = throwable.getMessage();
		Throwable nested = throwable;
		while (nested.getCause() != null)
		{
			nested = nested.getCause();
			error = nested.getMessage();
		}
		return error;
	}

}
