import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter n? ");
		// input
		int number = input.nextInt();
		System.out.println(number);
		printstar(number);
        input.close();
	}

	public static void printstar(int x) {
		int half = x / 2;
		for (int i = 1; i <= half; i++) {
			for (int j = half - i; j >= 0; j--) {
				System.out.printf(" ");
			}
			for (int j = x - 2 * half; j <= 2 * i - 1 && j <= x; j++) {
				System.out.printf("*");
			}
			for (int j = half - i; j >= 0; j--) {
				System.out.printf(" ");
			}
			System.out.print("\n");			
		}
		if (x % 2 != 0) {
			for (int i = 1; i <= x; i++) {
				System.out.printf("*");				
			}
			System.out.print("\n");
		}
		for (int i = half; i >= 1; i--) {
			for (int j = half - i; j >= 0; j--) {
				System.out.printf(" ");
			}
			for (int j = x - 2 * half; j <= 2 * i - 1 && j <= x; j++) {
				System.out.printf("*");
			}
			for (int j = half - i; j >= 0; j--) {
				System.out.printf(" ");
			}
			System.out.print("\n");			
		}
	}
}
