
public class Quick_sort {

	public static void main(String[] args) {
		
		int arr[] = {4,3,1,2,9,6,9,7};
		
		sort(0,arr.length-1,arr);
		
		for(int a:arr)
		{
			System.out.println(a);
		}

	}
	
	static int partition(int l,int h,int arr[])
	{
		int i=l;
		int j=h;
		
		int pivot = arr[l];
		
		
		while(i<j)
		{
			do
			{
				i++;
			}while(arr[i]<=pivot);
			
			do
			{
				j--;
			}while(arr[j]>pivot);
			
			//swap(arr[i],arr[j]);
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
		
		//swap(arr[l],arr[j]);
		int temp = arr[l];
		arr[l]=arr[j];
		arr[j]=temp;
		return j;
		
	}
	
	

	 static void sort(int l, int h,int arr[]) {
		
		if(l<h)
		{
			int j = partition(l,h,arr);
			sort(l,j,arr);
			sort(j+1,h,arr);
		}
	}

}
