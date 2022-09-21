import java.util.ArrayList;
import java.util.List;

public class Prime_factor {

	public static List<Integer> prime(int x)
	{
		List<Integer> list = new ArrayList<>();
		
		while(x%2==0)
		{
			x/=2;
			list.add(2);
		}
		
		for(int i=3;i<=Math.sqrt(x);i+=2)
		{
			
			while(x%i==0)
			{
				x/=i;
				list.add(i);
			}
		}
		
		if(x>2)
		{
			list.add(x);
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		
		int x =  50;
		
		List<Integer> list =  prime(x);
		System.out.println(list);

	}

}
