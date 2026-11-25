import java.util.Scanner;

public class Index{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		for (int number = 0; number < word.length(); number++) {
			if (number % 2 == 0){
				System.out.println(word.charAt(number));
			}
		}
	}
}
