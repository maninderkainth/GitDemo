
public class ReverseString {

	public static void main(String[] args) {
		String string = "Hello there";
		StringBuilder builder = new StringBuilder();
		builder.append(string);
		String reversedString = builder.reverse().toString();
		System.out.println(reversedString);

	}

}
