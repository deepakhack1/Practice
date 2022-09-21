package Stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class First_repeat_and_non_repeat {

	public static void main(String[] args) {
		
		
		String s ="deppeak";
		
		char c = s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
				.entrySet().stream().filter(entry->entry.getValue()==2L).map(entry->entry.getKey()).findFirst().get();
		
		System.out.println(c);

	}

}
