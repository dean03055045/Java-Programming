import java.util.Scanner;
public class HW1Revised {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// input
		System.out.println("Enter x?");
		double x = input.nextDouble();
		double lower = 0, eps = 1e-10, mid = 0;
		double upper = (x > 1)? x : 1;
		// algorithm
		while (upper - lower > eps) {
			mid = (upper + lower) / 2;
			double square = mid * mid;
			if (square == x)
				break;
			else if (square > x)
				upper = mid;
			else
				lower = mid;
		}
		//output
		System.out.printf("Square Roots are %f and %f", mid, -mid);
		input.close();
	}
}