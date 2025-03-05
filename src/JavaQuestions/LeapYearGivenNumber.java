package JavaQuestions;

import java.util.Scanner;

public class LeapYearGivenNumber {

	public static void main(String[] args) {
	/*
	 * Leap year is an year having 366 days, while the normal year has 365 days.
	 * If the year is evenly divisible by 4 and not divisible by 100, then it is a leap year. 
	 * If the year is evenly divisible by 4 and 100,then we need to check if it is evenly divisible by 400, to confirm it as Leap year.
	 * 
	 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the year :");
		int year=sc.nextInt();
		
		sc.close();
		boolean isLeapYear=false;
		if(year % 4 ==0) 
		{
			if(year % 100 == 0) 
			{
				if(year % 400 == 0)
				{
					isLeapYear=true;
				}else
				{
					isLeapYear=false;
				}
			}else 
			{
				isLeapYear=true;
			}
		}else
		{
			isLeapYear=false;
		}
		
		if(isLeapYear)
		{
			System.out.println("Give year "+year+" is a Leap year");
		}else
		{
			System.out.println("Give year "+year+" is not a Leap year");
		}
		
	}

}
