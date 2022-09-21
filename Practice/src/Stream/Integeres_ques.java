package Stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
import java.util.stream.*;

public class Integeres_ques {

	public static void main(String[] args) {
		
	
		Integer arr[] = {1,2,3,4,4,3};
		
		List<Integer> list1 = Arrays.asList(arr);
		
		System.out.println(list1);
		
	
		
		//IntStream stream = Arrays.stream(arr);

		//int max = stream.max().getAsInt();
		
		list1 = list1.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).collect(Collectors.toList());
		
		
		System.out.println(list1);
		
		
		//stream.
		
		//System.out.println(max);
	    
	    //return sum;
		
		
	List<Integer> list = Arrays.asList(1,7,8,9,25,25);
		
	int count = list.stream().collect(Collectors.summingInt((Integer::intValue)));
		
	System.out.println(count);	
	
	long size = list.stream().collect(Collectors.counting());
	
	System.out.println(size);
	
	Double avg = list.stream().collect(Collectors.averagingInt((Integer::intValue)));
	System.out.println(avg);
	
	Double avg1 = list.stream().map(i->Math.pow(i,2)).filter(i->i>100).collect(Collectors.averagingDouble(Double::doubleValue));
	
	System.out.println(avg1);
	
	//list = list.stream().filter(i->i%2!=0).collect(Collectors.toList());
	
	Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
	
	System.out.println(map);
	
	HashSet<Integer> set = new HashSet<>();
	
	//list = list.stream().filter(i->!set.add(i)).collect(Collectors.toList());
	
	list = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1)
	.map(i->i.getKey()).collect(Collectors.toList());
	
	
	System.out.println(list);
	
	
		
	}

}
