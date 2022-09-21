
public class Second_smallest {

	public static int secondSmallest(int arr[])
	{
		if(arr.length==0 || arr.length==1)
		{
			return -1;
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
				min = arr[i];
		}
		
		int min2 = min;
		
		for(int i=0;i<arr.length;i++)
		{
			if(min != arr[i])
				min2 = arr[i];
			
			if(min2 != min)
			{
				Math.min(min2,arr[i]);
			}
		}
		
		return min2;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,4,5,9,1,6,2,8};
		
		int x = secondSmallest(arr);

	}

}
