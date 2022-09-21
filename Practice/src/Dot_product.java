
public class Dot_product {
	
	static int dotProduct(int arr1[],int arr2[])
	{
		if(arr1.length == 0 && arr2.length==0)
		return 0;
		
		int sum = 0;
		for(int i=0;i<arr1.length && i<arr2.length;i++)
		{
		  sum+=arr1[i]*arr2[i];	
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2};
		int arr1[] = {2,3};
		
		int res = dotProduct(arr,arr1);
		
		System.out.println(res);
		
		

	}

}
