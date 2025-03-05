package JavaQuestions;

import java.util.Scanner;

/*
 * Print the integer number entered by user
 */

public class PrintInteger {
 
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the integer number");
		
		int num=sc.nextInt();
		
		System.out.println("The number entered is " +num);

	}

}
