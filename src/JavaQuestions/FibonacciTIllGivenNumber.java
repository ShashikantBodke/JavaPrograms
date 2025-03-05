package JavaQuestions;

import java.util.Scanner;

public class FibonacciTIllGivenNumber {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number for the series end");
		int num=sc.nextInt();
		sc.close();
		
		int a=1,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
	
		int f=0;
		while(f<=num) {
			f=a+b;
			
			if(f>num) {
				break;
			}
			
			System.out.print(f+" ");
			
			a=b;
			b=f;
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	}

}
