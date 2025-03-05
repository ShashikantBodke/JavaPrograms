package JavaQuestions;

public class DecimalToBinary {

	public static void main(String[] args) {

		System.out.println(convertDecimalToBinary(10));

	}

	public static int convertDecimalToBinary(int decimal) {
		int binary = 0;
		int remainder = 1, n = 1;

		while (decimal != 0) {
			remainder = decimal % 2;
			decimal = decimal / 2;
			binary += remainder * n;
			n *= 10;
		}
		return binary;

	}

}
