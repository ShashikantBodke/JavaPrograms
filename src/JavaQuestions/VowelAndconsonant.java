package JavaQuestions;

public class VowelAndconsonant {

	public static void main(String[] args) {
		// a,e,i,o,u
		
		char ch='a';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("Character is vowel ");
		}else {
			System.out.println("Character is consonant ");
		}

		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Character is vowel");
			break;
		default:
			System.out.println("Character is consonant");
			break;
		}
	
	
	
	}

}
