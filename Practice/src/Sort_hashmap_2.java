import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Name_compare implements Comparator<String>
{


	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}

public class Sort_hashmap_2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		map.put(4,"deepak");
		map.put(3,"block");
		map.put(5,"fish");
		map.put(1,"anil");
		map.put(2,"honey");
		
		sort(map);
	

	}

	private static void sort(HashMap<Integer, String> map) {
		
		List<Map.Entry<Integer,String>> list = new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		
		//Collections.sort(list, (i1,i2)->i1.getValue().compareTo(i2.getValue()));;
		
		list = list.stream().sorted((i1,i2)->i1.getValue().compareTo(i2.getValue())).collect(Collectors.toList());
		
		HashMap<Integer, String> map4 = new HashMap<>();
		
		for(Map.Entry<Integer, String> map2 : list)
		{
			map4.put(map2.getKey(),map2.getValue());
		}
		
		System.out.println(map4);
		
		
		
	}

}
