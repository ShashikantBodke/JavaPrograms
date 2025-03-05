package JavaQuestions;

import java.util.Scanner;

public class PrintNoOfSpaceLettersDigitOtherThings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string text");
		String str=sc.nextLine();
		sc.close();
		
		char[] ch=str.toCharArray();
		int digits=0;
		int letters=0;
		int spaces=0;
		int others=0;
		
		for(Character c: ch)
		{
			if(Character.isDigit(c))
			{
				digits++;
			}else if(Character.isLetter(c))
			{
				letters++;
			}else if(Character.isSpaceChar(c))
			{
				spaces++;
			}else
			{
				others++;
			}
			
		}
		System.out.println("Number of digits in the given string text is: "+digits+" ");
		System.out.println("Number of letters in the given string text is: "+letters+" ");
		System.out.println("Number of spaces in the given string text is: "+spaces+"");
		System.out.println("Number of symbols & other things in the given string text is: "+others);
		
	}

}
