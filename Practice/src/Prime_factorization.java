import java.util.ArrayList;
import java.util.List;

public class Prime_factorization {
	
	public static List<Integer> primeFactor(int num)
	{
		List<Integer> list = new ArrayList<>();
		
		int x = 2;
		
		while(num%x==0)
		{
			list.add(x);
			num = num/x;
		}
		
		for(int i=3;i<num/2;i+=2)
		{
			if(num%i==0)
			{
				list.add(i);
				num = num/i; 
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		
		int num = 315;
		
		List<Integer> list = primeFactor(num);
		
		System.out.println(list);

	}

}
