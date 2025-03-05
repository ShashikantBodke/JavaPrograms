package JavaQuestions;

public class FactorialRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=5;
		
		System.out.println(factorial(num));
	}

		public static int factorial(int num) {
			
			if(num>=1) {
				return num*factorial(num-1);
			}else {
				return 1;
			}
		}   
	
	
}
