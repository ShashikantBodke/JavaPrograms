package JavaQuestions;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSeries {

	public static void main(String[] args) {

		// 0,1,1,2,3,5,8,13

		/*
		 * int num=10; 
		 * int t1=0; 
		 * int t2=1;
		 * 
		 * for(int i=1; i<=num;i++) {
		 * 
		 * System.out.println(t1);//0,1,1,2 
		 * int sum=t1+t2;//1,2,3 
		 * t1=t2;//1,1,2
		 * t2=sum;//1,2,3
		 */

		// Without Using Recursion
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; i++) {
			n3 = n2 + n1;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println(" ");
//---------------------------------------------------------------------------------------------------		

		// Using Recursive Function
		int count1 = 10;
		System.out.print(a + " " + b);
		getFibonacci(count1 - 2);
		System.out.println(" ");
		
// -----------------------------------------------------------------------------------------------		
		
		// using HashMap
		int s = 10;
		for (int j = 0; j < s; j++) {
			System.out.print(fibonacci(j) + " ");
		}

	}

	// Using Recursive Function
	static int a = 0, b = 1, c = 0;

	public static void getFibonacci(int count1) {
		if (count1 > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			getFibonacci(count1 - 1);
		}
	}

//-------------------------------------------------------------------------------------------------------	
	
	// using HashMap
	public static Map<Integer, Integer> memo = new HashMap<>();

	public static int fibonacci(int s) {
		if (s <= 1)
			return s;
		if (memo.containsKey(s))
			return memo.get(s);
		int result = fibonacci(s - 1) + fibonacci(s - 2);
		memo.put(s, result);
		return result;
	}

}
