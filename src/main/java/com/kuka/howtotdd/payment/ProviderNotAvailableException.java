package com.kuka.howtotdd.payment;

public class ProviderNotAvailableException extends Exception {

	private static final long serialVersionUID = -5912252538400499571L;

	public ProviderNotAvailableException(String message) {
		super(message);
	}
}
