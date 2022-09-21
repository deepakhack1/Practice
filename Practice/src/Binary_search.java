
public class Binary_search {

	public static int binary(int arr[],int data,int l,int h)
	{
		if(h>=l)
		{
			int mid = l + (h-l)/2;
			
			if(arr[mid]==data)
			{
				
				return mid;
			}
			
			else
			{
				if(arr[mid]>data)
				{
					return binary(arr,data,0,mid-1);
				}
				else
				{
				 	return binary(arr,data,mid+1,h);
				}
				
			}
		}
		
		return -1;
	}
	
	
	static int binary(int arr[],int data)
	{
		int start = 0;
		int end = arr.length-1;
		
		int mid = start + (end-start)/2;
		
		while(start <= end)
		{
			if(arr[mid]==data)
				return mid;
			
			else
			{
				if(arr[mid]>data)
					end = mid-1;
				
				else
					start = mid+1;
					
			}
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
	
		int arr[] = {2,2,3,5,6,9,10,12,18};
		
	//	int index = binary(arr,2,0,arr.length-1);
		
		
		
		int index = binary(arr,6);
				
	    System.out.println(index+1);

	}

}
