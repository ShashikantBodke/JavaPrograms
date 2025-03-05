package JavaQuestions;

import java.util.Scanner;

public class GivenStringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		sc.close();
	
		char[] ch=str.toCharArray();
		int size=ch.length;
		String reversedString= "";
		
		
		for(int i=size-1;i>=0;i--) {
			reversedString=reversedString+ch[i];
		}
		System.out.println(reversedString);
		
		if(str.equals(reversedString)
				)
		{
			System.out.println("given string is palindrome");
		}else
		{
			System.out.println("given string is not a palindrome");
		}
	}

}
