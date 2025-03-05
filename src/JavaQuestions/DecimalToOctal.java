package JavaQuestions;

public class DecimalToOctal {

	public static void main(String[] args) {

		System.out.println(convertDecimalToOctal(78));

	}

	public static int convertDecimalToOctal(int decimal) {

		int octalNumber = 0, i = 1;
		while (decimal != 0) {
			octalNumber += (decimal % 8) * i;
			decimal /= 8;
			i *= 10;
		}
		return octalNumber;
	}

}
