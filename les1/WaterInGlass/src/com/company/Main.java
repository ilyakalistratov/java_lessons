package com.company;

public class Main {

    public static void main(String[] args) {
	final int glassVolume = 200; //ml
	final double glassFillingPersentage = 75.5; //%
        double result = glassVolume * glassFillingPersentage / 100;
        System.out.println("result = " + result);
    }
}
