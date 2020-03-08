package com.company;

public class Main {

    public static void main(String[] args) {
        final int priceOfShirt = 1500;
        final int numberOfShirts = 2;
        final int numberOfShirtsToHaveDiscount = 5;
        int numberNeedToAdd = numberOfShirtsToHaveDiscount - numberOfShirts;
        System.out.println("numberNeedToAdd = " + numberNeedToAdd);

        int shirtsCost = numberOfShirts * priceOfShirt;
        System.out.println("shirtsCost = " + shirtsCost);

        int needToAddShirtsCost = numberNeedToAdd * priceOfShirt;
        System.out.println("needToAddShirtsCost = " + needToAddShirtsCost);

        final double discountPercentage = 25;
        double sumCostAllOfShirtsWithDiscount = (shirtsCost + needToAddShirtsCost) * (100 - discountPercentage) / 100;
        System.out.println("sumCostAllOfShirtsWithDiscount = " + sumCostAllOfShirtsWithDiscount);

        double priceOfShirtWithDiscount = priceOfShirt * (100 - discountPercentage) / 100;
        System.out.println("priceOfShirtWithDiscount = " + priceOfShirtWithDiscount);

        double amountOfMoneySaved = shirtsCost + needToAddShirtsCost - sumCostAllOfShirtsWithDiscount;
        System.out.println("amountOfMoneySaved = " + amountOfMoneySaved);

        double numberOfFreeShirts = amountOfMoneySaved / priceOfShirt;
		System.out.println("numberOfFreeShirts = " + numberOfFreeShirts);
	}
}
