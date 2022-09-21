
public class Power_a_to_b {

	/*
	static int power(int x,int y)
	{
		if(x==0)
			return 0;
		
		if(y==0)
			return 1;
		
		return x * power(x,y-1);
		
	}
	*/
	
	static double power(int x,int y)
	{
		if(y==0)
			return 1;
		
		if(x==0)
			return 0;
		
		double res = 1;
		
		
		double temp = power(x,y/2);
		res =  temp * temp;
		
		if(y%2==1)
		{
			res = res * x;
		}
		
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
		int x = 4;
		int y = 3;
		
		double ans = power(x,y);
		
		System.out.println(ans);

	}

}
