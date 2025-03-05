package JavaQuestions;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=1234;
		int rev=0;
		
		while(num!=0) {
			int n=num%10; //4,3,2,1 (reminder)
			rev=rev*10+n;//4,43,432,4321 (reverse number)
			num=num/10;//123,12,1,0
		}
		
		System.out.println(rev);
		
		
		
	}

}
