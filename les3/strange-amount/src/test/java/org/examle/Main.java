package org.examle;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + (i - 1) - i;
                System.out.println("i = " + i);
                System.out.println("sum = " + sum);
            }
        }
        System.out.println("sum result = " + sum);
    }
}
