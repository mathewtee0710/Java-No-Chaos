import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		String reversed = "";
		for (int number = word.length() - 1; number >= 0; number--){
			reversed += word.charAt(number);
		}
		
		if (word.equals(reversed)) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
	}
}
