package JavaQuestions;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		int x=100;
		int y=300;
		int z=100;
		
		if(x>y && x>z) {
			System.out.println("x is the greatest");
		}else if(y>z){
			System.out.println("y is the greatest");
		}else {
			System.out.println("z is the greatest");
		}
		
		if(x>=y) {
			if(y>=z) {
				System.out.println("x is the greatest");
			}else {
				System.out.println("z is the greatest");
			}
		}else {
			if(y>=z) {
				System.out.println("y is the greatest");
			}else {
				System.out.println("z is the greatest");
			}
		}
		
	}

}
