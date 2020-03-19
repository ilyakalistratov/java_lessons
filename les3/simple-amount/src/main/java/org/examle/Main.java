package org.examle;

public class Main {
    public static void main(String[] args) {
        //Sn = b1 ⋅ (1 — qn) / (1 — q),
        final int q = 2;
        final double result = 1 * (1 - Math.pow(q, 100)) / (1 - q);
        System.out.println("result = " + result);
    }
}
