package JavaQuestions;

import java.util.Scanner;

public class SumOfDigitsInGivenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any digit number");
		
		int num=sc.nextInt(); //5432
		sc.close();
		int sumOfDigits=0;
		while(num>0)
		{
			int reminder = num % 10;  // 2  3  4 
			sumOfDigits = sumOfDigits + reminder; //2 5 9
			num =num / 10; //543 54 5
		}	
		System.out.println(sumOfDigits);
	}
}
