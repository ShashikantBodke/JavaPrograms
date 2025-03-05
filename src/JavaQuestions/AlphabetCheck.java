package JavaQuestions;

public class AlphabetCheck {

	public static void main(String[] args) {
		
		char c='M';
		
		
		if ((c>='a' && c<='z') ||(c>='A' && c<='Z'))
		{
			System.out.println(c+ " is a Alphabet ");
		}
		else {
			System.out.println(c+" not a Alphabet");
		}
	}

}
