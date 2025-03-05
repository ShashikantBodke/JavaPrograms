package JavaQuestions;

public class PrimeNumberInterval {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// 20 to 50
		int low = 20;
		int high = 50;

		while (low < high) {

			boolean flag = false;

			for (int i = 2; i <= low / 2; i++) {
				if (low % i == 0) {
					flag = true;
					break;
				}

			}

			if (!flag) {
				System.out.println(low);
			}

			low++;
		}

	}

}


