
public class Lab3_pow {

	public static void main(String[] args) {
		for (int i = -10; i < 11; i ++)
			System.out.println(pow(2, i));
	}
	public static double pow(double x, int n) {
		//base case
		if (n == 0) return 1;
		else if (n == 1) return x;
		
		int absn = Math.abs(n);
		double ans = pow(x, absn / 2);
		ans *= ans;
		if (absn % 2 != 0) ans *= 2;
	    if (n < 0) return 1 / ans;
	    else return ans;
	}
}
