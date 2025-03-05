package JavaQuestions;

import java.util.Scanner;

public class SumOfDigitsGivenNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number ");
		int num = sc.nextInt(); //5124
		sc.close();

		int sum = 0;

		while (num != 0) {
			int reminder = num % 10; //4
			sum = sum + reminder; //
			num = num / 10 ; //512
			
			
			
		}
		System.out.println("Sum of the all digits is : "+sum);
	}

}
