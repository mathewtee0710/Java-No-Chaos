import java.util.Scanner;

public class SeparateLine{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		String word = "";
		for (int number = 0; number <= sentence.length(); number++) {
			if (number == sentence.length() || sentence.charAt(number) == ' ') {
				if (!word.equals("")) {
					System.out.println(word);
					word = "";
				}
			} else {
				word += sentence.charAt(number);
			}
		}
	}
}
