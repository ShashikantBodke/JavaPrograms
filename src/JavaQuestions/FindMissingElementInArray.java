package JavaQuestions;



public class FindMissingElementInArray {

	public static void main(String[] args) {
		
		int []a= { 1,2,3,4,6};
		
		//Sum without miss
		int sumWithoutMiss=0;
		for(int i=1;i<=6;i++)
		{
			sumWithoutMiss=sumWithoutMiss+i;
		}
	//	System.out.println(sumWithoutMiss);

		
		//sum with miss
		int sumwithMiss=0;
		for(int e:a)
		{
			sumwithMiss=sumwithMiss+e;
		}
	//	System.out.println(sumwithMiss);
		
		System.out.println(" Missing Element is: "+(sumWithoutMiss-sumwithMiss));
	
	}

}
