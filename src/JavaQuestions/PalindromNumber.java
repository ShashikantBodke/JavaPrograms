package JavaQuestions;

public class PalindromNumber {

	public static void main(String[] args) {
		
		//121----121
		
		int num=121;
		int revNumber=0;
		
		int actualNum=num;
		
		while(num!=0) {
			int reminder = num % 10;
			revNumber = revNumber * 10 + reminder;
			num = num /10;
		}
		
		System.out.println(revNumber);
		
		if(actualNum==revNumber) {
			System.out.println(actualNum+ " is a Palindrom Number");
		}else {
			System.out.println(actualNum+ " is not a Palindrom Number");
		}
		
	}

}
