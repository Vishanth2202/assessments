package assessments.one;

import java.util.Scanner;

/* Reverse a Number */
public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123456789;
		int result = 0;

		while (number != 0) {
			result = result * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Reverse Number = " + result);
		reverseString();
		count();
		amstrongNumber();
		evenOdd();
		addEven();
		palindrome();
	}

	public static void reverseString() {

		String number = "0123456789";

		for (int i = number.length() - 1; i >= 0; i--) {

		}
		System.out.println("Reverse String = " + number);
	}

	public static void count() {

		int number = 123456789;
		int count = 0;

		while (number != 0) {
			number = number / 10;
			count++;

		}
		System.out.println("Count = " + count);

	}

	public static void amstrongNumber() {

		int number = 153;
		int original = number;
		int result = 0;

		while (number != 0) {

			int digit = number % 10;

			result = result + digit * digit * digit;

			number = number / 10;
		}

		if (result == original) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}
	}

	public static void evenOdd() {

		System.out.print("Even Numbers:");

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.print("Odd Numbers:");

		for (int i = 1; i <= 20; i++) {

			if (i % 2 != 0) {
				System.out.print(i + ", ");
			}
		}
	}

	public static void addEven() {

		int sum = 0;

		for (int i = 2; i <= 50; i = i + 2) {
			sum = sum + i;
		}
		System.out.println();
		System.out.println("Sum = " + sum);
	}

	public static void palindrome() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int original = number;
		int reverse = 0;

		while (number != 0) {

			int digit = number % 10;
			reverse = reverse * 10 + digit;

			number = number / 10;

		}
		if (original == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		scanner.close();
	}

}