package JavaQuestions;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Mr Shashikant Bodke";
		String[] words=str.split(" ");
		
		String reversedString="";
		for(String word: words)
		{
			String reversedWord="";
			
			for(int i=word.length()-1;i>=0;i--)
				{
					reversedWord=reversedWord+word.charAt(i);
				}
			reversedString=reversedString+reversedWord+ " ";
		}	
		System.out.println(reversedString);
	}
}
