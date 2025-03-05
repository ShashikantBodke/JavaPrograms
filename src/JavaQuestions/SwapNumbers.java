package JavaQuestions;

public class SwapNumbers {

	public static void main(String[] args) {
		
		//With temp variable
		
		int a=20;
		int b=30;
		
		System.out.println("Before Swapping");
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);
		
		System.out.println("After Swapping");
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a is :"+a);
		System.out.println("b is :"+b);	
		
		// without temp variable
		
		int c=50;
		int d=60;
		
		System.out.println("Before Swapping");
		System.out.println("c is :"+c);
		System.out.println("d is :"+d);
		
		System.out.println("After Swapping");
		
		c=c-d; //a=a-b;
		d=c+d; //b=a+b; 
		c=d-c; //a=b-a 
	
		
		System.out.println("c is :"+c);
		System.out.println("d is :"+d);
		
		
	}

}
