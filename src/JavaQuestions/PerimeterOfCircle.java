package JavaQuestions;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of radius");

		double radius=sc.nextDouble();
		sc.close();
		System.out.println("Perimeter of the circle for given "+radius+" radius is :"+((Math.PI)*2*radius));
		
	}

}
