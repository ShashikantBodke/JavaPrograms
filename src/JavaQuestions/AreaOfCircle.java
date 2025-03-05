package JavaQuestions;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the value of radius: ");
		double radius=scanner.nextDouble();
		scanner.close();
		
		System.out.println("Area of the circle for the given "+radius+" is "+(Math.PI)*radius*radius);
		
		
		
		

	}

}
