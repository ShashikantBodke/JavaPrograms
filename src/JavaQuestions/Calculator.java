package JavaQuestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two number");
		
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		
		System.out.println("Please enter an operator: (+ - * / ): ");
		
		char operator=sc.next().charAt(0);
		double result;
		
		switch (operator) {
		case '+':
			result=first+second;
			System.out.println("Addition of two numbers is : "+result);
			break;
		case '-':
			result=first-second;
			System.out.println("Subtraction of two numbers is : "+result);
			break;
		case '*':
			result=first*second;
			System.out.println("Multiplication of two numbers is : "+result);
			break;
		case '/':
			result=first/second;
			System.out.println("Division of two numbers is : "+result);
			break;

		default:
			System.out.println("Please use proper operator from the given list only");
			break;
		}
		
		
		
	}

}
