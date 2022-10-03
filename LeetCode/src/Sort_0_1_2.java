
public class Sort_0_1_2 {
	
	static void sort(int arr[]) {
		
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		int temp ;
		
		while(mid<=high) {	
			
			switch(arr[mid]) {
			
			case 0 : {
				temp = arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				mid++;
				low++;
				break;
			}
			
			case 1 : {
				mid++;
				break;
			}
			
			case 2 : {
				temp = arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				break;
			}
			
			}
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {2,0,1};
		sort(arr);
		
		for(int i : arr)
		System.out.println(i); 
		
	}

}
