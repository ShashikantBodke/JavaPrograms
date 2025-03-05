package JavaQuestions;

public class NuaturalNumberSumRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5; //5+4+3+2+1
		int sum=addNum(num);
		System.out.println(sum);
		
		
	}
	
	
	public static int addNum(int num) {
		if(num!=0) {
			return num+addNum(num-1);
		}else {
			return num;
		}
	}
}
