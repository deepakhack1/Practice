import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {


	static List<List<String>> groupAnagrams(String[] strs) {
		
		if(strs.length == 0)
		{
			return new ArrayList();
		}
		
		HashMap<String,List<String>> hashMap = new HashMap<>();
		
		Arrays.stream(strs).forEach(s->{
			char c[] = s.toCharArray();
			Arrays.sort(c);
		
			String s1 = String.valueOf(c);
			
			if(!hashMap.containsKey(s1)) {
			
				hashMap.put(s1,new ArrayList<>());
			}
			hashMap.get(s1).add(s);
			
		});
			
		List<List<String>> list = new ArrayList<>();
		
		for(Map.Entry<String,List<String>> map : hashMap.entrySet())
		{
			list.add(map.getValue());
		}
		
		return list;
		
		
    }
	
	public static void main(String[] args) {
	
		
	String strs[] = {"eat","tea","tan","ate","nat","bat"};
	
	List<List<String>> groupAnagrams1 = groupAnagrams(strs);
	
	System.out.println(groupAnagrams1);
	
	}

}
