import java.util.Scanner;

public class Distinct{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter target: ");
		int target = input.nextInt();
		
		for (int a = 1; a <= 9; a++) {
			for (int b = a + 1; b <= 9; b++) {
				for (int c = b + 1; c <= 9; c++) {
					if (a + b + c == target) {
						System.out.println(a + ", " + b + ", " + c);
					}
				}
			}
		}
	}
}
