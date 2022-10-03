import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Missing_and_Repeating_number {
	
	static void findbyMarkVisitedApproach(int arr[]) {
		
		if(arr.length==0 && arr.length==1) {
			System.out.println("array is not valid");
			return;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			int x = Math.abs(arr[i]);
			
			if(arr[x-1] > 0) {
				arr[x-1] = -1 * arr[x-1];
			}
			
			else
			{
				System.out.println("repating number is :"+x);
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				System.out.println("missing number is : "+(i+1));
			}
		}
			
	}
	
	static void findByMap(int arr[]) {
		
		Set<Integer> set = new HashSet<>();	
		
		for(Integer i : arr) {
			if(!set.contains(i)) {
				set.add(i);
			}
			else{
				System.out.println("repeating is : "+i);
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			if(!set.contains(i)) {
				System.out.println("Missing is :"+i);
			}
		}
		
	}
	

	public static void main(String[] args) {
		
		int arr[] = {4, 3, 6, 2, 1, 1};
		int arr1[] = {4, 3, 6, 2, 1, 1};
		
		findbyMarkVisitedApproach(arr);
		findByMap(arr1);

	}

}
