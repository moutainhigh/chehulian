package com.car.app.common.exception;

public class ExcelException extends RuntimeException {
	
	public ExcelException() {
	}

	public ExcelException(String message) {
		super(message);
	}

	public ExcelException(Throwable cause) {
		super(cause);
	}

	public ExcelException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcelException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super();
	}

}
