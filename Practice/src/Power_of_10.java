
public class Power_of_10 {
	
	static boolean power(int x)
	{
		while(x>1)
		{
			if(x%10!=0)
			{
				return false;
			}
			
			x /=10;
			
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
	
		int x = 102;
		
		boolean b =power(x);
		
		System.out.println(b);

	}

}
