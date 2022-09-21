package GS_Practice;

public class Power {

	/*
	static int power(int x,int y)
	{
		if(x==0)
			return 0;
		
		if(y==0)
			return 1;
		
		
		int temp = power(x,y/2);
		int result = temp * temp;
		
		if(y%2 == 1)
		{
			result = result * x;
		}
		
		return result;
	}
	*/
	static int power_a_to_b(int x,int y)
	{
		if(x==0)
			return 0;
		
		if(y==0)
			return 1;
		
		return x * power_a_to_b(x,y-1);
		
	}
	
	public static void main(String[] args) {
		
		//int x = power(2,6);
		
		int y = power_a_to_b(2,6);
		
		System.out.println(y);
	}

}
