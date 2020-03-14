package org.example;

public class Main {
    public static void main(String[] args) {
        final int height = 180;
        final int weight = 65;

        final double perfectWeight = height - 100 - (height * 10.0 / 100.0);
        System.out.println("perfectWeight = " + perfectWeight);

        if (weight >= (perfectWeight - 5) && weight <= (perfectWeight + 5)) {
            System.out.println("You have perfect weight");
        } else {
            System.out.println("Your weight is not perfect !!!");
        }
    }
}
