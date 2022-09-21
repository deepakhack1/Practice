package GS_Practice;

public class Median_sorted_2_arrays {
	
	static double median(int arr1[],int arr2[])
	{
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		if((n1+n2)%2==1)
		{
			int i=0;
			int j=0;
			
			int med = -1;
			
			for(int count = 0;count<=(n1+n2)/2;i++)
			{
				if(i!=n1 && j!=n2)
				{
					med = arr1[i]<arr2[j]?arr1[i++]:arr2[j++];
				}
				
				if(i<n1)
				{
					med = arr1[i];
				}
				
				if(j<n2)
				{
					med = arr2[j];
				}
				
			}
			
			
			return med;
			
		}
		else
		{
			int i=0;
			int j=0;
			
			int med = -1;
			int med2 = -1;
			
			for(int count = 0;count<=(n1+n2)/2;i++)
			{
				 med2 = med;
				
				if(i!=n1 && j!=n2)
				{
					med = arr1[i]<arr2[j]?arr1[i++]:arr2[j++];
				}
				
				if(i<n1)
				{
					med = arr1[i];
				}
				
				if(j<n2)
				{
					med = arr2[j];
				}
				
			}
			
			return (med+med2)/2;
		}
		
	}

	public static void main(String[] args) {
		
		int arr1[] = { 1,3 };
	    int arr2[] = { 2,4 };
	    
	    double ans = median(arr1,arr2);

	}

}
