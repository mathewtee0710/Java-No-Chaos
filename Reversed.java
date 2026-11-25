import java.util.Scanner;

public class Reversed{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		String reversed = "";
		for (int number = word.length() - 1; number >= 0; number--) {
			reversed += word.charAt(number);
		}
		
		System.out.println(reversed);
	}
}
