package JavaQuestions;

import java.util.Scanner;


public class MultiplicationTableGivenNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for Multiplication Table :");
		int number=sc.nextInt();
		
		sc.close();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(number +" X "+i+"="+(number*i));
		}
		

	}

}
