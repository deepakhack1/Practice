import java.util.Arrays;

public class ChocolateDistribution {

	
	static int minDiff(int arr[],int m) {
		
		int l = arr.length;
		int min_diff = Integer.MAX_VALUE;
		
		if(m>l)
		{
			return -1;
		}
		
		Arrays.sort(arr);
		
		
		
		for(int i=0;i+m-1<l;i++) {
			int diff = arr[i+m-1]-arr[i];
			if(diff<min_diff) {
				min_diff=diff;
			}
			
		}
		
		
		return min_diff;
		
		
	}
	
	
	public static void main(String[] args) {
		
		 int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                 40, 28, 42, 30, 44, 48, 43, 50 };

		 int no_of_students=7;
		 
		 System.out.println(minDiff(arr,no_of_students));
		 
		
	}

}
