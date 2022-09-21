
public class Median_sorted_2_Arr {
	
	public static double median(int arr1[],int arr2[],int m,int n)
	{
		int i=0;
		int j=0;
		
		double med=0;
		double med1=0;
		
		if((m+n)%2==1)
		{
			for(int count=0;count<=(m+n)/2;count++)
			{
				
				if(i!=m && j!=n)
				{
					med = (arr1[i]>arr2[j])?arr2[j++]:arr1[i++];
				}
				
				else if(i<m)
				{
					med = arr1[i++];
				}
				else
				{
					med = arr2[j++];
				}
				
				System.out.println(med);
			}
			
			return med;
		}
		else
		{
			for(int count=0;count<=(m+n)/2;count++)
			{
				 med1 = med;
				
				if(i!=m && j!=n)
				{
					med = (arr1[i]>arr2[j])?arr2[j++]:arr1[i++];
				}
				
				else if(i<m)
				{
					med = arr1[i++];
				}
				else
				{
					med = arr2[j++];
				}
				
				System.out.println(med+" "+med1);
			}
		}
		
		return (med+med1)/2;
	}

	public static void main(String[] args) {
		
		int arr1[] = { 1,3 };
	    int arr2[] = { 2,4 };
	 
	    int n1 = arr1.length;
	    int n2 = arr2.length;
	    
	    double x = median(arr1,arr2,n1,n2);
	    System.out.println(x);

	}

}
