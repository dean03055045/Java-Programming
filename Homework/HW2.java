import java.util.Scanner;
public class HW2 {
	public static void main(String[] args) {
		// produce secret number
		int ans = (int) (Math.random() * 100);		
		// for testing
		//System.out.println(ans);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess the number between 0 and 99!");		
		int guess;
		int lower = 0, upper = 99;
		boolean gamestop = false;
		// game logic and output		
		do{ 
			guess = input.nextInt();
			gamestop = (guess == ans || lower == upper)? true : false;
			if (guess > upper || guess < lower){
				System.out.printf("The input must between %d and %d, try again.\n", lower, upper);
			}
			else if (guess > ans){
				upper = guess - 1;
				if (lower == upper) {
					break;
				}
				else System.out.printf("Wrong Answer! The number is between %d and %d, try again?\n", lower, upper);
			}
			else if (guess < ans){
				lower = guess + 1;
				if (lower == upper) {
					break;
				}
				else System.out.printf("Wrong Answer! The number is between %d and %d, try again?\n", lower, upper);
			}			
		}while (!gamestop);
		if (upper == lower) {
			System.out.printf("You lose! The answer is %d\n", ans);
		}
		else {
			System.out.println("Great job!");
		}
		input.close();		
	}
}