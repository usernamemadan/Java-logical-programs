package com.junittesting;

public class MontlyPayment {
	public static void main(String[] args) {
		double P = Double.parseDouble(args[0]);
		int Y = Integer.parseInt(args[1]);
		double R = Double.parseDouble(args[2]);
		
		double payment = util.monthlyPayment(P, Y, R);
		
		System.out.println("Monthly Payment is " + payment);
			
	}
}
