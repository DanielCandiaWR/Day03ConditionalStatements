package com.day03introtoconditionalstatements.app;
import java.util.Scanner;
/*
 * HackerRank 30 Days of Code
 * ========== Day 03 Intro to Conditional Statements ===========
 * Given an integer, n, perform the following conditional actions:
 * - If n is odd, print Weird.
 * - If n is even and in the inclusive range of 2 to 5, print Not Weird.
 * - If n is even and in the inclusive range of 6 to 20, print Weird.
 * - If n is even and greater than 20, print Not Weird.
 */
public class ConditionalStatements {
	private static final Scanner scanner = new Scanner(System.in);
	public static String OddEvenNumber(int number) {
		String message = "";
		if((number%2==0) && ((number>=2 && number<=5) || number>20 ))
			message = "Not Weird";
		else if((number%2!=0)||(number%2==0 && (number>=6 && number<=20)))
			message = "Weird";
		return message;
	}
	public static void main(String[] args) {
		int number = scanner.nextInt();
		scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
		System.out.println(OddEvenNumber(number));
	}
}
