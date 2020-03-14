package org.example;

public class Main {
    public static void main(String[] args) {
        final int currentHour = 24;
        if (currentHour >= 4 && currentHour <= 11) {
            System.out.println("It's morning now");
        } else if (currentHour >= 12 && currentHour <= 16) {
            System.out.println("It's day");
        } else if (currentHour >= 17 && currentHour <= 23) {
            System.out.println("It is evening now");
        } else if (currentHour >= 0 && currentHour <= 3) {
            System.out.println("It's night now");
        } else if (currentHour < 0) {
            System.out.println("Enter the correct time of day");
        } else {
            System.out.println("Please return from another planet to Earth!");
        }
    }
}
