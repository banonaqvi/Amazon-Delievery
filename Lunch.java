package main;

import Services.USP;

public class Lunch {

	public static void main(String[] args) {
AmazonT amz = new AmazonT();
amz.setService(new USP());
Boolean status = amz.DeliverProduct(679.0);
if(status)
	System.out.println("We are happy to serve....");
	else 
		System.out.println("faild....");
	}
	

}
