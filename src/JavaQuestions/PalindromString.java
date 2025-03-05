package JavaQuestions;

public class PalindromString {

	public static void main(String[] args) {
		
		System.out.println(isPalindrom("madam".toLowerCase()));
		System.out.println(isPalindrom("radar".toLowerCase()));
		System.out.println(isPalindrom("Level".toLowerCase()));

	}

	public static boolean isPalindrom(String msg) {
		String reversed= new StringBuilder(msg).reverse().toString();
		return msg.equals(reversed);
				
	}
}
