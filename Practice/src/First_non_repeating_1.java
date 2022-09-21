import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First_non_repeating_1 {
	
	static char firstNonRepeat(String s)
	{
		HashMap<Character,Boolean> map = new HashMap<>();
		
		char c[] = s.toCharArray();
		
		for(char ch : c)
		{
			if(map.containsKey(ch))
			map.put(ch,false);
			
			else
				map.put(ch,true);
		}
		
		for(int i=0;i<s.length();i++)
		{
			if(!map.get(s.charAt(i)))
		       return s.charAt(i);
			
		}
		
		return '\0';
		
	}

	public static void main(String[] args) {
		
		String s = "lpple";

		char c = firstNonRepeat(s);
		
		System.out.println(c);
		
		char ch = s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
		.stream().filter(i->i.getValue()==1L).map(i->i.getKey()).findFirst().get();
		
		System.out.println(ch);
		
	}

}
