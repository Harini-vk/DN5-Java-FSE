package com.cognizant.week1.finance;

public class FinancialForecasting {
	public static double Fin_prediction(double currentval, int year, double growthrate) {
		if (year == 0) {
			return currentval;
		}
		else {
			return Fin_prediction(currentval*(1+growthrate),year - 1, growthrate);
			
		}
	}

	public static void main(String[] args) {
		System.out.println(Fin_prediction(1000.00,5,0.10));
	}
}
