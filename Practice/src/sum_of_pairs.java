import java.util.HashSet;

public class sum_of_pairs {

	public static void main(String[] args) {


		int arr[] = {2,4,3,3,5};
		
		int n = 10;
		
		sum_equal(arr,n);

		
	}

	private static void sum_equal(int[] arr, int n) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(n-arr[i]))
			{
				System.out.println(arr[i]+"  "+(n-arr[i]));
			}
			
			set.add(arr[i]);
			
			}
		}
		
		
		
	}


