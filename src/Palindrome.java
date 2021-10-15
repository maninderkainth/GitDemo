
public class Palindrome {

	static boolean isPalindrome(String word) {
		int i = 0, j = word.length() - 1;
		while (i < j) {
			if (word.charAt(i) != word.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String word = "radar";
		if (isPalindrome(word)) {
			System.out.println("It's a palindrome");
		}
		else {
			System.out.println("It's not a palindrome");
		}
	}

}
