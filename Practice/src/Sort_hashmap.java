import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sort_hashmap {

	public static void main(String[] args) {
		
		
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("deepak",7);
		map.put("ravi", 1);
		map.put("ram", 8);
		map.put("abc", 6);
		

		
		
	HashMap<String,Integer> map1  =	sorted(map);
	
	for(Map.Entry<String,Integer> map2 : map1.entrySet())
	{
	System.out.println(map2.getKey()+"   "+map2.getValue());
	}

	}

	private static HashMap<String, Integer> sorted(HashMap<String, Integer> map) {
		
			List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
			
			
			Collections.sort(list,(i1,i2)->i1.getValue().compareTo(i2.getValue()));
			
			List<Map.Entry<String,Integer>> list1 = map.entrySet().stream().sorted((s1,s2)->s1.getValue().compareTo(s2.getValue())).collect(Collectors.toList());
			
			
			Collections.sort(list, new Comparator<Map.Entry<String,Integer>>()
					{
				public int compare(Map.Entry<String,Integer> v1, Map.Entry<String,Integer> v2) {
					
					return v1.getValue().compareTo(v2.getValue());
					
					
				}
					});
					
			
			HashMap<String,Integer> map3 = new LinkedHashMap<String,Integer>();
			
			for(Map.Entry<String,Integer> map4 : list1)
			{
				map3.put(map4.getKey(),map4.getValue());
			}
			
			
			return map3;
		
	}
	
	
	

}



	
	


