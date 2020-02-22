package com.capg.onlinebooking.service;

import com.capg.onlinebooking.dao.OnlineBookingDao;
import com.capg.onlinebooking.dao.OnlineBookingDaoImpl;
import com.capg.onlinebooking.model.PaymentMethod;

import java.util.HashMap;

public class OnlineBookingServiceImpl implements OnlineBookingService {
	OnlineBookingDao dao=new OnlineBookingDaoImpl();
	public double calculateTotalCost() {
		// TODO Auto-generated method stub
		double p=dao.calculateTotalCost();
		double cost,seatprice=1500;
		System.out.println("Each seat price is:1500");
		cost=p*seatprice;
		return cost;	}
	
	public PaymentMethod choosePaymentMethod() {
		// TODO Auto-generated method stub
		
		return dao.choosePaymentMethod();
	}
	
	public boolean makePayment(PaymentMethod option, double a) {
		
		return dao.makePayment(option, a);
	}

	
	

}
