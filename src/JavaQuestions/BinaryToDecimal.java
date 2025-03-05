package JavaQuestions;

public class BinaryToDecimal {

	public static void main(String[] args) {

		System.out.println(convertBinaryToDecimal(1010));
		System.out.println(convertBinaryToDecimal(10100));
	}

	public static int convertBinaryToDecimal(int binary) {
		int decimal = 0;
		int n = 0;
		while (binary != 0) {
			int remainder = binary % 10;
			decimal += remainder * Math.pow(2, n);
			binary = binary / 10;
			n++;
		}
		return decimal;

	}

}
