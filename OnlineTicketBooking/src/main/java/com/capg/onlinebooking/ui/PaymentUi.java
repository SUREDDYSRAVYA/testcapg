package com.capg.onlinebooking.ui;
import com.capg.onlinebooking.service.OnlineBookingService;
import com.capg.onlinebooking.service.OnlineBookingServiceImpl;
import com.capg.onlinebooking.model.PaymentMethod;
import java.util.Random;
import java.util.Scanner;

public class PaymentUi {
	static PaymentMethod object=new PaymentMethod();
    static OnlineBookingService service=new OnlineBookingServiceImpl();
	public static void main(String[] args) {
		PaymentUi obj=new PaymentUi();
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
        double tcost;
		tcost=service.calculateTotalCost();
		System.out.println("Total Cost= "+tcost);
        
		PaymentMethod option=obj.choosePaymentMethod();
        
        boolean status=service.makePayment(option, tcost);
        System.out.println("Enter your card number:");
        long cardnumber=s.nextLong();
        System.out.println("Enter your CVV:");
        int cvv=s.nextInt();
        if(status) {
		System.out.println("Payment Successful");
        }
        Random r=new Random();
        int randomNumber=r.nextInt(1000);
        System.out.println("Your booking ID IS:"+randomNumber);
        Random m=new Random();
        int movie=m.nextInt(20);
        System.out.println("your movie id is:"+movie);
	}

	public PaymentMethod choosePaymentMethod() {
		Scanner in=new Scanner(System.in);
		int ch,ch1=1;
		while(ch1!=0)
		{
			  
			System.out.println("1.credit card");
			System.out.println("2.debit card");
			ch=in.nextInt();
			switch(ch)
				{
				case 1:
					PaymentMethod method=service.choosePaymentMethod();
					return method;
				case 2:
					PaymentMethod method1=service.choosePaymentMethod();
					return method1;
				default:
					System.out.println("wrong choice");
				}
				
		
	}
		return null;
		}

}
