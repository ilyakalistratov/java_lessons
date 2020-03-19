package org.example;

public class Main {
    public static void main(String[] args) {
        final int totalWeight = 100;
        final int monthWeight = 6;
        final int monthPayment = 100;
        int totalPayment = 0;

        for (int i =  totalWeight; i >= 0 ; i = i - monthWeight) {
            totalPayment = totalPayment + monthPayment;
        }
        System.out.println("totalPayment = " + totalPayment);
    }
}
