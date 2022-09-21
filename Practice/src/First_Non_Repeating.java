import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_Repeating {
	
	public static char nonRepeat(String s)
	{
		if(s.length()==0)
		{
			return '\0';
		}
		
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			map.compute(ch, (k,v)->(v==null)?1:++v);
		}
		
//		for(int i=0;i<s.length();i++)
//		{
//			if(map.containsKey(s.charAt(i)))
//			{
//				int val = map.get(s.charAt(i));
//				map.put(s.charAt(i),val+1);
//			}
//			else
//				map.put(s.charAt(i), 1);
//		}

		int res = Integer.MAX_VALUE;
		
		for(Map.Entry<Character,Integer> map1 : map.entrySet())
		{
			int val1 = map1.getValue();
			if(val1==1)
			{
				return map1.getKey();
			}
			
			
			
		}
		
//		for(int i=0;i<s.length();i++)
//		{
//			int val = map.get(s.charAt(i));
//			if(val==1)
//			{
//				return i;
//			}
//			
//		}
		
		return '\0';
	}

	public static void main(String[] args) {
		
		String s = "addfepeakp";
		
		char a = nonRepeat(s);
		
		System.out.println(a);

	}

}
