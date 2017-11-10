
public class Problem6 {

	public static int main(String[] args) {
		// create set
		int set[] = new int[1000];
		for (int i = 0; i < 1000; i++) {
			set[i] = (int) (Math.random() * 2000 - 1000);
		}
		//sort the set
		int newset[] = merge_sort(set);
		// find the bigger one
        int p1 = newset[0] * newset[1] * newset[999];
        int p2 = newset[999] * newset[998] * newset[997];
        if(p1 > p2) {return p1;}
        else {return p2;}
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
}
