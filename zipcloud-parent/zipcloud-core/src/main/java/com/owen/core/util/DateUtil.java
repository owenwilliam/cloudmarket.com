package com.owen.core.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 日期处理，公用
 * 
 * @author OwenWilliam 2016-6-11
 * @since
 * @version v3.x.x
 *
 */
public class DateUtil
{

	/**
	 * 结束日期
	 * 
	 * @param date
	 * @return
	 */
	public static Date getEndOfDay(Date date)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
		return calendar.getTime();
	}

	/**
	 * 开始日期
	 * 
	 * @param date
	 * @return
	 */
	public static Date getStartOfDay(Date date)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar.getTime();
	}

}
