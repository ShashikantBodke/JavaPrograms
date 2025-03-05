package JavaQuestions;

import java.util.Scanner;

public class CountEvenOdddigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any digit number :");
		int num=sc.nextInt(); //5432
		
		sc.close();
		int evenCount=0;
		int oddCount=0;
		
		while(num>0)
		{
			int reminder = num % 10; //2
			if(reminder % 2 == 0)
			{
				evenCount++;
			}else
			{
				oddCount++;
			}
			
			num= num / 10;
		}
		
		System.out.println(evenCount+ " & " +oddCount);
	}

}
