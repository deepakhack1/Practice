
public class Snowpack {
	
	static int snowpack(int arr[])
	{
		if(arr.length<3)
			return 0;
		
		int left_arr[] = new int[arr.length];
		int right_arr[] = new int[arr.length];
		
		left_arr[0]=arr[0];
		
		for(int i=1;i<arr.length-1;i++)
		{
			left_arr[i]=Math.max(arr[i],left_arr[i-1]);
		}
		
		
		
		
		right_arr[arr.length-1]=arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--)
		{
			right_arr[i]=Math.max(arr[i],right_arr[i+1]);
		}
		
	
		
		int snow = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			snow+=Math.min(left_arr[i],right_arr[i])-arr[i];
		
		}
		
		return snow;
		
	}

	public static void main(String[] args) {
		
		int arr[] = {0,1,3,0,1,2,0,4,2,0,3,0};
		
		int ans = snowpack(arr);
		
		System.out.println(ans);
		

	}

}
