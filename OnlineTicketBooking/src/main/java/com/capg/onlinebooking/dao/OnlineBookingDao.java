package com.capg.onlinebooking.dao;
import com.capg.onlinebooking.model.PaymentMethod;
 
public interface OnlineBookingDao {
	public double calculateTotalCost();
	public PaymentMethod choosePaymentMethod();
	public boolean makePayment(PaymentMethod option, double a);

}

