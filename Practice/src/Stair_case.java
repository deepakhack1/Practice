
public class Stair_case {

	public static int stairCase(int n)
	{
		if(n<4)
		{
			if(n==3)
			{
				return 4;
			}
			if(n==2)
			{
				return 2;
			}
			
			return 1;
		}
	
		int arr[] = new int[n+1];
		
		for(int i=3;i<=n;i++)
		{
			arr[0]=1;
			arr[1]=1;
			arr[2]=2;
			arr[3]=4;
			
			arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
		}
		
		return arr[n];
		
	}
	
	public static void main(String[] args) {
		
		int ans = stairCase(10);

		System.out.println(ans);
		
	}

}
