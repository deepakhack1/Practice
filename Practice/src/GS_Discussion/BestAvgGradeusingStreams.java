package GS_Discussion;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BestAvgGradeusingStreams {
	
	static double bestAvgGrade(String s[][])
	{
		double max =  Stream.of(s).collect(Collectors.groupingBy(a->a[0],Collectors.averagingDouble(a->Double.parseDouble(a[1])))).entrySet().stream()
		.max(Map.Entry.comparingByValue()).map(entry->entry.getValue()).get();
		
		return max;
		
	
		
	}
	
	public static void main(String[] args) {

		String[][] s1 = { { "Rohan", "84" }, { "Sachin", "102" }, { "Ishan", "55" }, { "Sachin", "18" } };

		double val = bestAvgGrade(s1);
	
		System.out.println(val);
		
	}

}
