package com.capg.onlinebooking.dao;
import java.util.*;

import com.capg.onlinebooking.model.PaymentMethod;
import com.capg.onlinebooking.model.Seat;

public class OnlineBookingDaoImpl implements OnlineBookingDao {
List<Seat> list=new ArrayList<Seat>();
	public double calculateTotalCost() {
		// TODO Auto-generated method stub
		double tseats;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of seats you want to book:");
		tseats=sc.nextDouble();
		 //list.get(tseats);
		return tseats;
		
	}
public PaymentMethod choosePaymentMethod() {
	PaymentMethod x=new PaymentMethod();
	x.getOption();
	return x;
	}
	public boolean makePayment(PaymentMethod option, double a) {
		return true;
	}
	
	
}
