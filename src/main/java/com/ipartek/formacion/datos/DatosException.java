package com.ipartek.formacion.datos;

public class DatosException extends RuntimeException {

	private static final long serialVersionUID = -1130929286973569466L;

	public DatosException() {
		super();
	}

	public DatosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DatosException(String message, Throwable cause) {
		super(message, cause);
	}

	public DatosException(String message) {
		super(message);
	}

	public DatosException(Throwable cause) {
		super(cause);
	}

}
