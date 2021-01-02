package com.cadastrobancoapi.exceptionhandler;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ErroException extends RuntimeException{

	private HttpStatus httpStatus;
	
	private static final long serialVersionUID = 1L;
	
	public ErroException(String message) {
		super(message);
		this.httpStatus = HttpStatus.BAD_REQUEST;
	}
	
	@Override
	public synchronized Throwable initCause(Throwable cause) {
		return super.initCause(cause);
	}

}
