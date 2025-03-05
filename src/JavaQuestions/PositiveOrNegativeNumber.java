package JavaQuestions;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		double number = 12.33;
		
		if(number<0.0) {
			System.out.println(number+ " is negative number");
		}
		
		else if(number > 0.0) {
			System.out.println(number+ " is positive number");
		}
		
		else {
			System.out.println(number+ " is zero");
		}
	}

}
