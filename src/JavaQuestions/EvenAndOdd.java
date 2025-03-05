package JavaQuestions;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hey, Please enter the number");

		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println(a + ":  is Even Number");
		} else {
			System.out.println(a + ": is Odd Number");
		}

	}
}
