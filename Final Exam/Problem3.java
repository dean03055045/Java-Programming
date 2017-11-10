import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// input
		int number = input.nextInt();
		System.out.println(digitalsum(number));
		input.close();
	}
	public static int digitalsum(int num) {
		int ans = 0;
		while (num != 0) {
			int temp = num % 10;
			ans += temp;
			num /= 10;
		}
		return ans;
	}

}
