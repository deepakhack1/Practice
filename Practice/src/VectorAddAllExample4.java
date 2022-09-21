import java.util.*;  
public class VectorAddAllExample4 {    
	
	public static void bubble(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}
	
	public static void selection(int arr[])
	{
	    for(int i=0;i<arr.length;i++)
	    {
	    	int min = arr[i];
	    	int minindex = i;
	    	
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(min>arr[j])
	    		{
	    			min = arr[j];
	    			minindex =j;
	    			
	    		}
	    		
	    		
	    	}
	    	
	    	if(minindex!=i)
    		{
    		 arr[minindex]=arr[i];
    		 arr[i]=min;
    		
    		}
	    }
	}
	
	public static void insertion(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int key= arr[i];
			
			while(j>=0 && arr[j]>key)
			{
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1]=temp;
				
				j--;
			}
			
			arr[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		
		
		int arr[] = {5,7,3,1,2,9,6};
	
		
		//bubble(arr);
		
		//selection(arr);
		
		insertion(arr);
		
		
		
	
		for(int i:arr)
		{
			System.out.println(i);
		}

	          
          }              
} 