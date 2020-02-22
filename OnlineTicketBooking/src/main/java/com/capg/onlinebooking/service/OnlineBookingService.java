package com.capg.onlinebooking.service;

import com.capg.onlinebooking.model.PaymentMethod;

public interface OnlineBookingService {
	public double calculateTotalCost();
	public PaymentMethod choosePaymentMethod();
	public boolean makePayment(PaymentMethod option, double a);
	

}
