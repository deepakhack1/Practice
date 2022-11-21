import java.util.HashMap;

public class Repeat_missing_number {
	
	static void repeatAndMissingHashMap(int arr[]) {
		
		HashMap<Integer,Boolean> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==null) {
				map.put(arr[i],true);
			}
			else
			{
				System.out.println("repeating number is "+arr[i]);
			}	
		}
		
		for(int i=1;i<=arr.length;i++) {
			if(map.get(i)==null) {
				System.out.println("missing number is "+i);
			}
		}
	    
		
	}
	
	
	static void repeatAndMissingUsingIndex(int arr[]) {
	
		for(int i=0;i<arr.length;i++){
			int abs_val = Math.abs(arr[i]);
			if(arr[abs_val-1]>0) {
				arr[abs_val-1] = - arr[abs_val-1];
			}
			else
			{
				System.out.println("repeating element is "+abs_val);
			}			
		}	
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
			{
				System.out.println("missing element is "+(i+1));
			}
		}
		
	}

	public static void main(String[] args) {
		
		int arr[] = {3,1,2,5,3};
		
		repeatAndMissingHashMap(arr);
		repeatAndMissingUsingIndex(arr);
				

	}

}
