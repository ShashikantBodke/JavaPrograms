package JavaQuestions;

public class NaturalNumSum {

	public static void main(String[] args) {
		
		int num=100;
		int sum=0;
		
//		for(int i=1;i<=num;i++) {
//			sum=sum+i;
//		}
//		System.out.println("Sum is : " +sum);	
		
		System.out.println("-------------------");
		
		int k=1;
		while(k<=num) {
			sum=sum+k;
			k++;
		}
		System.out.println("Sum is : " +sum);
		
		
		
	}

}
