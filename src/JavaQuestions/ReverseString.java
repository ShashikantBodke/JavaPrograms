package JavaQuestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Shashikant";
		char[] ch=str.toCharArray();
		int size=ch.length;
		
		String reversedString = "";
		
		for(int i=size-1;i>=0;i--) {
			reversedString=reversedString+ch[i];
		}
		
		System.out.println(reversedString);
	}

}
