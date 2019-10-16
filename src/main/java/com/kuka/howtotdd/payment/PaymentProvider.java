package com.kuka.howtotdd.payment;

public interface PaymentProvider {
	boolean isAvailable();
	boolean deposit(int id, int amount);
}
