import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Best_Average_Grade {
	
	static int bestAvgGrade(String s1[][])
	{
		HashMap<String,List<Integer>> map = new HashMap<>();
		
		//List<Integer> list = new ArrayList<>();
		
		for(String[] score : s1)
		{
			if(map.containsKey(score[0]))
			{
				//map.put(score[0], list);
				//list.add(Integer.parseInt(score[1]));
				
			}
			
			else
			{
				map.put(score[0],new ArrayList<>());
				
			}
			
			map.get(score[0]).add(Integer.parseInt(score[1]));
		}
		
		
		HashMap<String,Integer> map2 = new HashMap<>();
		
		for(Map.Entry<String,List<Integer>> map1 : map.entrySet())
		{
			if(map1.getValue().size()>1)
			{
				int average = avg(map1.getValue());
				map2.put(map1.getKey(),average);
			}
			else
			{
				map2.put(map1.getKey(),map1.getValue().get(0));
			}
		}
		
		
		Entry<String, Integer> max = map2.entrySet().stream().max((s,s2)->s.getValue().compareTo(s2.getValue())).get();
		
		
		
		
		
		
		return max.getValue();
	}
	
	static int avg(List<Integer> list)
	{
		double average = list.stream().collect(Collectors.averagingInt(Integer::intValue));
		
		return (int)average;
	}
	
	

	public static void main(String[] args) {
		
		String[][] s1 = { { "Rohan", "8" }, { "Sachin", "102" }, { "Ishan", "55" }, { "Sachin", "18" } };

		int val = bestAvgGrade(s1);
		
		System.out.println(val);

	}

}
