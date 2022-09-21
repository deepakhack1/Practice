import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Group_anagram {
	
	public static void groupAnagram(String input)
	{
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		String[] s = input.split(" ");
		
		for(String w:s)
		{
			char arr[] = w.toCharArray();
			Arrays.sort(arr);
			
			String s3 = new String(arr);
			
			if(map.containsKey(s3))
			{}
			else
			{
				//System.out.println();
				map.put(s3,new ArrayList<>());
			}
			
			map.get(s3).add(w);
			//System.out.println(map.get(w));
		}
		
		for(String s1:map.keySet())
		{
			
			if(map.get(s1).size()>1)
			{
				for(String s2:map.get(s1))
						{
					System.out.println(s2);
						}
			}
		}
	}

	public static void main(String[] args) {
		
		 String input = "cat dog tac sat tas god dog";
		 
		 groupAnagram(input);

	}

}
