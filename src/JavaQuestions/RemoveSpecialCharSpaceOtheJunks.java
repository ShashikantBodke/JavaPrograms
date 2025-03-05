package JavaQuestions;

public class RemoveSpecialCharSpaceOtheJunks {

	public static void main(String[] args) {
		
		String str= "$131#@% $abcd123 ABCDEF()";
		String str2=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str2);

	}

}
