package GS_Discussion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class L24BestAvGrades {

	
	
	public static double bestAvgGrade(String s1[][])
	{
		if(s1.length==0)
			return -1.0;
		
		HashMap<String,List<Double>> map = new HashMap<>();
		
		for(String s2[] : s1)
		{
			if(s2[0]==null || s2[1]==null)
				return -1.0;
			
			if(map.containsKey(s2[0]))
			{
				
			}
			
			else
			{
				
				map.put(s2[0],new ArrayList<>());
			}
			
			map.get(s2[0]).add(Double.parseDouble(s2[1]));
		}
		
		
		
		HashMap<String,Double> map2 = new HashMap<>();
		
		for(Map.Entry<String,List<Double>> map1 : map.entrySet())
		{
			if(map1.getValue().size() > 1)
			{
				double avg = average(map1.getValue());
				map2.put(map1.getKey(),avg);
			}
			else
				map2.put(map1.getKey(),map1.getValue().get(0));
		}
		
		
		Map.Entry<String,Double> entry = map2.entrySet().stream().max((i1,i2)->i1.getValue().compareTo(i2.getValue())).get(); 
	
		double max =  entry.getValue();
		
		List<String> list = new ArrayList<>();
		
		
		for(Map.Entry<String,Double> map3: map2.entrySet())
		{
			if(map3.getValue()==max)
				list.add(map3.getKey());
				
		}
		
		//map2.entrySet().stream().filter(i->i.getValue()==max).map();
		
		
		return -1;
	}
	
	public static double average(List<Double> list)
	{
		return list.stream().collect(Collectors.averagingDouble(Double::doubleValue));
	}
	
	
	

	public static boolean pass() {
		String[][] s1 = { { "Rohan", "84" }, { "Sachin", "102" }, { "Ishan", "55" }, { "Sachin", "18" } };

		return bestAvgGrade(s1) == 84;
	}

	public static void main(String[] args) {
		if (pass()) {
			System.out.println("Pass");
		} else {
			System.out.println("Some Fail");
		}
	}

	}


