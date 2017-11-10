
public class HW4Revised {

	public static void main(String[] args) {		
		// create ten random integers between -100 and 100
		int [] randomlist = new int [10];
		for (int i = 0; i < randomlist.length; i++){
			randomlist[i] = (int) (Math.random() * 201 - 100);
		}
		// for testing
		//display(randomlist);
		
		int [] result_bubble = bubble_sort(randomlist);
		int [] result_insertion = insertion_sort(randomlist);
		int [] result_selection = selection_sort(randomlist);
		int [] result_merge = merge_sort(randomlist);
		// for testing
		//display(result_bubble);
		//display(result_insertion);
		//display(result_selection);
		//display(result_merge);
		
		// for sort algorithm comparing
		int [] testlist = new int [10000];
		
		// bubble sort
		for (int i = 0; i < testlist.length; i++){
			testlist[i] = (int) (Math.random() * 201 - 100);
		}
		long t0 = System.currentTimeMillis();
		bubble_sort(testlist);
		long t1 = System.currentTimeMillis();
		System.out.printf("Bubble sort = %d (ms)\n", t1 - t0);
		
		// insertion sort
		for (int i = 0; i < testlist.length; i++){
			testlist[i] = (int) (Math.random() * 201 - 100);
		}
		t0 = System.currentTimeMillis();
		insertion_sort(testlist);
		t1 = System.currentTimeMillis();
		System.out.printf("Insertion sort = %d (ms)\n", t1 - t0);
		
		// Selection sort
		for (int i = 0; i < testlist.length; i++){
			testlist[i] = (int) (Math.random() * 201 - 100);
		}
		t0 = System.currentTimeMillis();
		selection_sort(testlist);
		t1 = System.currentTimeMillis();
		System.out.printf("Selection sort = %d (ms)\n", t1 - t0);

		// Merge sort
		for (int i = 0; i < testlist.length; i++){
			testlist[i] = (int) (Math.random() * 201 - 100);
        }
		t0 = System.currentTimeMillis();
		merge_sort(testlist);
		t1 = System.currentTimeMillis();
		System.out.printf("Merge sort = %d (ms)\n", t1 - t0);	
	}
	
	public static int[] bubble_sort(int[] list) {
		for (int i = list.length - 2; i >= 0 ; i--){
			for (int j = 0; j <= i; j++){
		        if (list[j] > list[j + 1]){
		            int temp = list[j];
		            list[j] = list[j + 1];
		            list[j + 1] = temp;
		        }		                    
			}
		}
		return list;
	}
    
	public static int[] insertion_sort(int[] list) {
		for (int i = 1; i < list.length; i++){
			int temp = list[i];
			int j;
			for (j = i - 1; j >= 0 && list[j] > temp; j--){
		        list[j + 1] = list[j];
		    }    
		    list[j + 1] = temp;
		}
		return list;
	}
	
	public static int[] selection_sort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			int k = i;
			for (int j = i + 1; j < list.length; j++) {
				if (list[k] > list[j]) k = j;
			}
			int temp = list[k];
			list[k] = list[i];
			list[i] = temp;
		}
		return list;
	}
	
    public static int[] merge (int [] list1, int [] list2){
		int [] new_list = new int [list1.length + list2.length];
		int idx_1 = 0, idx_2 = 0, idx_new = 0;
		while(idx_1 < list1.length && idx_2 < list2.length){
			if(list1[idx_1] <= list2[idx_2]){
				new_list[idx_new] = list1[idx_1];
				idx_new++;
				idx_1++;
			}
			else{
				new_list[idx_new] = list2[idx_2];
				idx_new++;
				idx_2++;
			}
		}
		if (idx_1 == list1.length){
			while(idx_2 < list2.length){
				new_list[idx_new] = list2[idx_2];
				idx_new++;
		        idx_2++;
			}
		}
		else if (idx_2 == list2.length){
			while(idx_1 < list1.length){
				new_list[idx_new] = list1[idx_1];
				idx_new++;
		        idx_1++;
			}
		}	
		return new_list;
	}	
	public static int[] merge_sort (int [] list){
		if (list.length <= 1)
			return list;
		int length = list.length / 2;
		int [] new_list1 = new int [length];
		int [] new_list2 = new int [list.length - length];
		for (int i = 0; i < length; i++){
			new_list1[i] = list[i];			
		}
		for (int i = 0; i < (list.length - length); i++) {
			new_list2[i] = list[length + i];
		}
		int [] sorted_new_list1 = merge_sort(new_list1);
		int [] sorted_new_list2 = merge_sort(new_list2);
		return merge(sorted_new_list1, sorted_new_list2);
	}
	
	public static void display(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.printf("%d ", A[i]);
		}
		System.out.println();
	}
}

