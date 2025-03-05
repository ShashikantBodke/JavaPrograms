package JavaQuestions;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		//2^3 -----2*2*2
		//2^3=2^1*2^2*2^3
				
		int base=2;
		int exponent=3;
		
//		long result=1;
//		while(exponent!=0) {
//			result*=base; //result*base; //2,4,8
//			--exponent;//2,1,0
//		}
//		System.out.println(result);
		
		System.out.println(Math.pow(base, exponent));		
	}
}
