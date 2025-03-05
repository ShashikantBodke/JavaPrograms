package JavaQuestions;

import java.util.Scanner;

public class PowerOfGivenNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int initialNumber=num;
		System.out.println("Enter value of Power :");
		int power=sc.nextInt();
		
		sc.close();
		for(int i=1;i<power;i++) {
			num=initialNumber * num;
		}
		
		
		System.out.println(""+initialNumber+" to the power "+power+" is :"+num);
	
	
	}

}
