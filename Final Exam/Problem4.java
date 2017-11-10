import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// input
		String word = input.next();
		System.out.println(palindrome_loop(word));
		System.out.println(palindrome_recur(word));
		input.close();
	}
	public static boolean palindrome_loop (String word){
		boolean palindrome = true;
		int length = word.length();
		for (int i = 0; i <= length / 2; i++) {
			if (word.charAt(i) != word.charAt(length - 1 - i)) {
				palindrome = false;
			}
		}
		return palindrome;
	}
	public static boolean palindrome_recur (String word){
		int length = word.length();
		// base case
		if (length < 2) {return true;}
		//recursive case
		if (word.charAt(0) != word.charAt(length - 1)) {return false;}
		else return palindrome_recur (word.substring(1, length - 1));
	}

}
