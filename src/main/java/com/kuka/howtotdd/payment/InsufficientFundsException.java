package com.kuka.howtotdd.payment;

public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = -2074965622395079592L;

	public InsufficientFundsException(String message) {
		super(message);
	}
}
