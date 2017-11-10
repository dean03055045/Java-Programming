import java.util.Scanner;
public class Problem7 {
	private static long[] f = new long[92];

    public static long fibonacci(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;

        // return cached value (if previously computed)
        if (f[n] > 0) return f[n];

        // compute and cache value
        f[n] = fibonacci(n-1) + fibonacci(n-2);
        return f[n];
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
		// input
		int n = input.nextInt();
        for (int i = 0; i <= n; i++)
            System.out.println(fibonacci(i));
        input.close();
    }
}
