import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// input
		int number = input.nextInt();
		System.out.println(BinaryToDecimal(number));
		System.out.println(DecimalToBinary(number));
		input.close();
	}
	public static int BinaryToDecimal(int binary){		 
	    int decimal = 0;
	    int p = 0;
	    while(binary != 0){
	        int temp = binary % 10;//last digit 
	        decimal += temp * Math.pow(2, p);
	        binary /= 10;
	        p++;
	    }
	    return decimal;
	}

	public static int DecimalToBinary(int decimal){
        int binary[] = new int[50];
        int index = 0;
        while(decimal > 0){
            binary[index] = decimal % 2;
            decimal /= 2;
            index++;
        }
        //convert array to number
        int ans = 0;
        for(int i = index - 1;i >= 0;i--){
            ans += binary[i] * Math.pow(10, i);
        }
        return ans;
    }
}
