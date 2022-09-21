import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Unique_tuples {
	
	static List<String> unique_Tuples(String a,int len)
	{
		
		HashSet<String> set = new HashSet<>();
		for(int i=0;i<a.length()-len+1;i++)
		{
			if(!set.contains(a.substring(i,i+len)))
			{
				set.add((a.substring(i,i+len)));
			}
			
		}
		
		List<String> list = new ArrayList<String>(set);
		
		return list;
	}

	public static void main(String[] args) {

		String a = "abba";
		
		List<String> list = unique_Tuples(a,2);
		
		System.out.println(list);
		
	}

}
