
public class PrimeNumber {

	public static void main(String[] args) {
		int number = 5, i, count = 0;
		for (i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is prime!");
		}
		else {
			System.out.println("Number is not a prime");
		}

	}

}
