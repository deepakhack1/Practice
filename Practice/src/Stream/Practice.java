package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) {
	
		String s ="depaek";
		
		//char ch[] s.toCharArray();
		
		char ch1 = 'a';
		
		long count = s.chars().count();
		
		List<Integer> list = Arrays.asList(1,7,9,8,9,25,25);
		
		System.out.println(count);

	char ch	= s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(i->i.getValue()>1L).map(i->i.getKey()).findFirst().get();
	
	//System.out.println(ch);

	int a  = list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(i->i.getValue()>1)
			.map(i->i.getKey()).findFirst().get();
	
	//System.out.println(a);
	
	Stream<Integer> stream = Stream.iterate(0,n->n+2);
	
	stream.limit(10).forEach(System.out::println);
	
	
	
	
	}

}
