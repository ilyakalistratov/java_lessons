package org.example;

public class Main {
    public static void main(String[] args) {
        final int number = 30;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && i < number) {
                System.out.println(number + " не простое число!!!");
                return;
            } else {
                System.out.println(number + " простое число");
                return;
            }
        }
    }
}
