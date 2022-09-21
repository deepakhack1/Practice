
public class Sub_Array_Exceeding_sum {
	
	static int subArrayExceedingSum(int arr[],int x)
	{
		if(arr.length==0)
			return -1;
		
	//	int sum =0;
		
		
		int min_len = arr.length + 1;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>x)
				return 1;
			
			
			int sum = arr[i];
			//int count = 1;
			
			
			
			for(int curr = i+1;curr<arr.length;curr++)
			{
				if(sum<x)
					sum+=arr[curr];
				
				
				
				System.out.println(sum + " "+ curr);
			
				
				
				if(sum>x && curr-i+1<min_len)
				{
					min_len = curr-i+1;
					break;
				}
					
				
				
					
			
					
			}
		}
		
		return min_len;
		
	}

	public static void main(String[] args) {
	
		 int arr1[] = {1, 4, 45, 6, 10, 19};
		 
		 int x = 3;
		 
		 int ans = subArrayExceedingSum(arr1,x);
		 
		 System.out.println(ans);

	}

}
