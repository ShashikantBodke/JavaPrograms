package JavaQuestions;

public class SumOfGivenArray {

	public static void main(String[] args) {
		int[] ar = { 6, 3, 2, 1, 9, 8, 7, 4, 5 };
		int sum = 0;
		for (int e : ar) {
			sum = sum + e;
		}
		System.out.println(sum);
	}
}
