import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class First_repeating_and_non_repeat {

	public static char first_repeat(String s)
	{
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!map.containsKey(s.charAt(i)))
				map.put(s.charAt(i),1);
			
			else
			{
				int val = map.get(s.charAt(i));
				map.put(s.charAt(i),val+1);
			}
		}
		
		for(Map.Entry<Character,Integer> map1 : map.entrySet())
		{
			if(map1.getValue()>1)
			{
				return map1.getKey();
			}
			
		}
		
		return '\0';
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "deppeak";
		
		char c = first_repeat(str);
		
		System.out.println(c);

		
		
	}

}
