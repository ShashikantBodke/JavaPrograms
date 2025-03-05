package JavaQuestions;

public class ArmStrongNumber {

	public static void main(String[] args) {
/*
 * If you cube every digit of the number and add them.
 * If this sum is equal to actual number, 
 * then we can call the number as Armstrong Number
 */
		
		//153 ==== 1^3+5^3+3^3
		//371
		
		
		int num=153;
		int actualNum=num;
		double result=0;
		
		while(actualNum!=0) {
			int n= actualNum % 10;
			result=result + Math.pow(n,3);
			
			actualNum=actualNum /10;
			
		}
		if(result == num) {
			System.out.println(num+ " is a armstrong number ");
		}else {
			System.out.println(num+ " is not an armstrong number ");
		}
		
	}

}
