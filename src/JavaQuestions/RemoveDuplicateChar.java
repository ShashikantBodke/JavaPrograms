package JavaQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an english statement");
		
		String str =sc.next();
		sc.close();
		
		char[] ch=str.toCharArray();
		
		Map<Character,Integer> m= new HashMap<>();
		for(Character c: ch) 
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);	
			} 	
				else  //first time
				{                 
					m.put(c, 1);  
				}
		}
	
		for(Character c: m.keySet()) 
		{
			if(m.get(c)>1) {
//				System.out.println("Character "+c+" is repeated "+m.get(c)+" times");
				System.out.print(c+"="+m.get(c)+ " ");

			}
		}
	
	}
}
	