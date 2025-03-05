package JavaQuestions;

import java.util.Scanner;

public class SearchElementInGivenArray {

	public static void main(String[] args) {
		int[]a= {8,1,5,9,12,33,23,7,4,3};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number from array to search any number");
		int searchNumber=sc.nextInt();
		sc.close();
		boolean found=false;
		 for(int i=0; i<a.length;i++)
		 {
			 if(searchNumber==a[i])
			 {
				 found=true;
				 System.out.println(searchNumber+" is found in this array at the index "+i);
				 break;
			 }
		 }
		
		if(!found) {
			System.out.println(searchNumber+" is not available in the array");
		}
	
	}

}
