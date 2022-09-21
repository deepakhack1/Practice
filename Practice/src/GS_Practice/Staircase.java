package GS_Practice;

public class Staircase {
	
	static int staircase(int x)
	{
		if(x<4)
		{
			if(x==2)
				return 2;
			
			if(x==3)
				return 4;
		
			return 1;
		}
		
		int arr[] = new int[x+1];
		//arr[] = arr[4] 
		//arr[0],arr[1],arr[2],arr[3]
		
		
		
		arr[0]=1;
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		
		for(int i=4;i<=x;i++)
		{
			
			arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
			
		}
		
		return arr[x];
		
	}

	public static void main(String[] args) {
		
		int x = staircase(4);
		
		System.out.println(x);

	}

}
