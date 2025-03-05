package JavaQuestions;

import java.util.Scanner;

public class CheckArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		sc.close();
		
		int actualNumber=num;
		int cubeNumber=0,reminder;
		
		
		while(num>0) 
		{
			reminder=num % 10;
			cubeNumber=cubeNumber+ (reminder*reminder*reminder);
			num= num / 10;
		}
		
		if(cubeNumber==actualNumber)
		{
			System.out.println("Given Number is Armstrong number");
		}else
		{
			System.out.println("Given number is not an Armstrong Number");
		}
		
	}

}
