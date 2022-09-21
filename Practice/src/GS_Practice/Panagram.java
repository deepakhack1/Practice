package GS_Practice;

import java.util.HashMap;

public class Panagram {
	
	static String panagram(String s)
	{
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		
		if(s.length()==0)
			return s1;

		HashMap<Character,Boolean> map = new HashMap<>();
		
		System.out.println(map);
		
		for(Character c : s.toCharArray())
		{
			if(!map.containsKey(c))
				map.put(c,false);
		}
		
		System.out.println(map);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<s1.length();i++)
			{
				if(!map.containsKey(s1.charAt(i)))
					sb.append(s1.charAt(i));
			}
		
		return sb.toString();
		
		
	}
	
	public static void main(String[] args) {
		
		String s = "aT";
		
		s = panagram(s);

		System.out.println(s);
	}

}
