
public class HW3 {

	public static void main(String[] args) {
		// create ten random integers between -100 and 100
		int [] randomlist = new int [10];
		for (int i = 0; i < randomlist.length; i++){
			randomlist[i] = (int) (Math.random() * 201 - 100);
		}
		// for testing
		for (int i = 0; i < randomlist.length; i++){
		    System.out.printf("%d,", randomlist[i]);		    
		}
		System.out.printf("\n");
		
		//bubble sort
		/*
		for (int i = randomlist.length - 2; i >= 0 ; i--){
			for (int j = 0; j <= i; j++){
		        if (randomlist[j] > randomlist[j + 1]){
		            int temp = randomlist[j];
		            randomlist[j] = randomlist[j + 1];
		            randomlist[j + 1] = temp;
		        }		                    
			}
		}
		*/				
		//insertion sort		
		for (int i = 1; i < randomlist.length; i++){
			int temp = randomlist[i];
			int j;
			for (j = i - 1; j >= 0 && randomlist[j] > temp; j--){
		        randomlist[j + 1] = randomlist[j];
		    }    
		    randomlist[j + 1] = temp;
		}
		// for testing
		for (int i = 0; i < randomlist.length; i++){
		    System.out.printf("%d,", randomlist[i]);		    
		}
	}
}