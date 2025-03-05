package JavaQuestions;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "  A  B  C  D  ";
		String str2=str.replaceAll("\\s","");
//		String str2=str.replaceAll(" ","");
		System.out.println(str2);
	}

}
