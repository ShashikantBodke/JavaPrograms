package JavaQuestions;



public class CompareArraysWitnoutInBuildMethod {

	public static void main(String[] args) {
		int[]a= {1,2,3,4};
		int[]b= {1,2,3,4};
		
		boolean compareStatus =true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i]) {
					compareStatus =false;
					break;
				}
			}
			
		}else
		{
			compareStatus =false;
		}
		
		if(compareStatus) {
			System.out.println(" Both are same ");
		}else {
		System.out.println(" Both are not same ");
		}
	}

}
