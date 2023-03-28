package week03;

import java.util.Random;

public class Assignment {
	
	public static String wordRepeat(String word, int n) {
		String repeat = "";
		for (int i = 0; i < n; i++) {
			repeat += word;
		}
		return repeat;
	}
	
	public static String fullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	public static boolean overCent(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double average(double[] array) {
		double sum = 0;
		for (double num : array) {
			sum += num;
		}
		double average = sum/array.length;
		return average;
	}
	
	public static boolean dosAvg(double[] doubleArray, double[] doubleArrayB) {
		double firstSum = 0;
		double secondSum = 0;
		
		for (double number : doubleArray) {
			firstSum += number;
		}
		
		for (double number : doubleArrayB) {
			secondSum += number;
		}
		
		double firstAvg = firstSum / doubleArray.length;
		double secondAvg = secondSum / doubleArrayB.length;
		
		if (firstAvg > secondAvg) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double MoneyInPocket) {
		
		if (isHotOutside == true && MoneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}	
	}
	
	public static boolean howManyLetters(String theName, int theGuess) {
		if (theName.length() == theGuess) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
	//	1
		System.out.println("---1---");
	//	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 10};
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		
		System.out.println("The average age is " + sum/ages.length + ".");
		
	//	2
		System.out.println("---2---");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// a
		double charNum = 0;
		double length = names.length;
		for (String name : names) {
			charNum += name.length();
		}
		
		System.out.println("The average number of letters per name is " + 
		(charNum/names.length));
		// b
		for (String name : names) {
			System.out.print(name + " ");
		}
		
	
		
		System.out.println("The last element of the array is " + names[names.length - 1] + 
							"     names[names.length -1]");
		
	//	3
		System.out.println("---3---");
		System.out.println("The first element of the array is " + names[0] + "     names[0]");
		
	//	4
		System.out.println("---4---");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();		
		}
		for (int nameLength : nameLengths) {
			System.out.println(nameLength);
		}
		
	//	5
		System.out.println("---5---");
		int sumOfLengths = 0;
		for (int nameLength : nameLengths) {
			sumOfLengths += nameLength;
		}
		System.out.println("The sum of all elements is " + sumOfLengths
				);
		
	//	6
		System.out.println("---6---");
		System.out.println(wordRepeat("Hello", 3));
		
	//	7
		System.out.println("---7---");
		System.out.println(fullName("Everett", "De Bree"));
		
	// 	8
		System.out.println("---8---");
		System.out.println(overCent(nameLengths));
		
	//	9
		System.out.println("---9---");
		double[] doubleArray = new double[5];
		for (int i = 1; i < doubleArray.length - 1; i++) {
			doubleArray[i] = i * 5.2;
		}
		System.out.println(average(doubleArray));
		
	// 	10
		System.out.println("---10---");
		double[] doubleArrayB = new double[5];
		for (int i = 1; i < doubleArrayB.length - 1; i++) {
			doubleArrayB[i] = i * 5.1999999;
		}
		System.out.println(dosAvg(doubleArray, doubleArrayB));
		
	//	11
		System.out.println("---11---");
		double pocket = 10.51;
		boolean isHotOutside = true;
		System.out.println(willBuyDrink(isHotOutside, pocket));
		
	// 	12	This method recieves one String value and one int value and returns true if the value of
	//		the int is equal to the number of characters found in the String value
		System.out.println("---12---");
		String theName = "Aphrodite";
		int theGuess = 9;
		System.out.println("There are " + theGuess + " letters in Aphrodite...");
		System.out.println(howManyLetters(theName, theGuess));
		
		
	}
	

	

	
	
}
