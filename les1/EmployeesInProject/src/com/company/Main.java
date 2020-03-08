package com.company;

public class Main {

    public static void main(String[] args) {
	final int numberOfProgrammers = 100;
	final int numberOfTesters = 2;
	final int numberOfSupportSpecialists = 4;
	int numberOfTestersInProject = numberOfProgrammers * numberOfTesters;
	int numberOfSupportSpecialistsInProject = numberOfProgrammers * numberOfSupportSpecialists;
	int sum = numberOfProgrammers + numberOfTestersInProject + numberOfSupportSpecialistsInProject;
        System.out.println("numberOfTestersInProject = " + numberOfTestersInProject);
        System.out.println("numberOfSupportSpecialistsInProject = " + numberOfSupportSpecialistsInProject);
        System.out.println("sum = " + sum);
    }
}
