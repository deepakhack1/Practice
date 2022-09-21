import java.util.HashMap;

public class Panagram {

	static String s1 = "abcdefghijklmnopqrstuvwxyz";
	
	static StringBuilder missingCharacters(String s)
	{
		StringBuilder sb = new StringBuilder();
		
		if(s.length()==0)
		{
			sb = new StringBuilder(s1);
			return sb;
		}
		
		HashMap<Character,Boolean> map = new HashMap<>();
		
		char arr[] = s.toCharArray();
		
		for(char c:arr)
		{
			if(!map.containsKey(c))
				map.put(c,true);
			
		}
		
		for(int i=0;i<s1.length();i++)
		{
			if(!map.containsKey(s1.charAt(i)))
				sb.append(s1.charAt(i));
		}
		
		return sb;
		
	}
	
	public static void main(String[] args) {
	
		String s = "abcdefghijklmnopqrstuvwxyz";
		
	StringBuilder s1 = 	missingCharacters(s);
	
	System.out.println(s1);

	}

}
