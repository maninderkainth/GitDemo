
public class Factorial {

	public static void main(String[] args) {
		int fact = 1, i, number = 5;
		for (i=number; i >= 1; i--) {
			fact *= i;
		}
		System.out.println(fact);

	}

}
