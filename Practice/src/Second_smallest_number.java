
public class Second_smallest_number {

	public static int secondSmallest(int arr[])
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min  = arr[i];
			}
		}
		
		int min2 = min;
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(min2!=arr[i])
				min2 = arr[i];
			
		
			
			if(min2!=min)
				min2 = Math.min(min2,arr[i]);
			
		
		}
		
		if(min2!=min)
			return min2;
		
		else
			return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,4,5,6,1,2};
		
		int x = secondSmallest(arr);
		System.out.println(x);
		
		
		}

	}


