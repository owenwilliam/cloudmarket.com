package com.owen.cloudmarket.api.exceptions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;

import com.owen.core.util.ExceptionUtil;

/**
 * 错误的处理
 * 
 * @author OwenWilliam 2016-6-14
 * @since
 * @version v4.x.x
 *
 */
public class ErrorInfo
{

	 public final String error;
	    public final String message;
	    public final int status;
	    public final String date;
		private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

	    public String getError() {
			return error;
		}

		public String getMessage() {
			return message;
		}

		public int getStatus() {
			return status;
		}

		public String getDate() {
			return date;
		}

		public ErrorInfo(Throwable throwable, String message, HttpStatus status) {
	    	this.error = ExceptionUtil.getRootMessage(throwable);
	    	this.message = message;
	    	this.date = dateFormat.format(new Date());
	    	this.status = status.value();
	    }

		@Override
		public String toString() {
			return "ErrorInfo [status="+status+", error=" + error + ", date=" + date + "]";
		}

}