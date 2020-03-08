package com.company;

public class Main {

    public static void main(String[] args) {
	final int apartmentCost = 5_000_000;
	final double downPaymentPercentage = 15;
	double sum = apartmentCost * downPaymentPercentage / 100;
        System.out.println("sum = " + sum);
    }
}
