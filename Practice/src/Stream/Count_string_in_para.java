package Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Count_string_in_para {

	public static void main(String[] args) {
		
		String str = "hhf deepak dndnd deepak dhdjd deepak";
		
		String str1[] = str.split(" ");
		
		Stream<String> stream = Arrays.stream(str1);
		
		
		
		String str2 = "deepak";
		
		long l = stream.filter(s->s.equalsIgnoreCase(str2)).count();
		
		System.out.println(l);
	
		

	}

}
