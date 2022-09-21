
public class Square_Root {
	
	public static double squareRoot(int n)
	{
		return findSqRt(n,0,n);
	}
	public static double findSqRt(double x,double min,double max)
	{
		double mid = (max+min)/2;
		
		double res = mid*mid;
		
		if(res < x + 0.001 && res > x-0.001)
		{
			return mid;
		}
		else if(res < x+0.001)
		{
			return findSqRt(x,mid,max);
		}
		else
		{
			return findSqRt(x,min,mid);
		}
		//return res;
		
		//return 0.0;
	}

	public static void main(String[] args) {

		int x = 9;
		
		double y = squareRoot(x);
		
		System.out.println(y);
		
	}

}
