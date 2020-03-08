package com.company;

public class Main {

    public static void main(String[] args) {
	final int distance = 9; // km
	final double averageTaxiSpeed = 48.1; // km/h
	double timeInDistanceToWork = distance / averageTaxiSpeed * 60; // min
    double decelerationCoefficient = 1.4;
    double timeInDistanceToHome = distance / averageTaxiSpeed * decelerationCoefficient * 60; // min
        System.out.println("timeInDistanceToWork = " + timeInDistanceToWork + " min");
        System.out.println("timeInDistanceToHome = " + timeInDistanceToHome + " min");
    }
}
