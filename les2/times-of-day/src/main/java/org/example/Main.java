package org.example;

public class Main {
    public static void main(String[] args) {
        final int currentHour = 7;
        if (currentHour >= 4 && currentHour <= 11) {
            System.out.println("It's morning now");
        } else if (currentHour >= 12 && currentHour <= 16) {
            System.out.println("It's day");
        } else if (currentHour >= 17 && currentHour <= 23) {
            System.out.println("It is evening now");
        } else {
            System.out.println("It's night now");
        }
    }
}
