import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_prg {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(9);

		list.add(5);
		list.add(70);
		list.add(11);
		list.add(2);
		
		
		System.out.println(list.size());
		
	
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("deepak");
		list1.add("Acb");
		list1.add("Abc");
		
		
		list = list.stream().filter(i->i>10).collect(Collectors.toList());
		
		list1 = list1.stream().filter(i1->i1.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(list);
		
		
		
		int max = list.stream().max((s1,s2)->s1.compareTo(s2)).get();
		int count = (int) list.stream().count();
		
		Set<Integer> set= list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toSet());
		
		int sum = list.stream().collect(Collectors.summingInt((Integer::intValue)));
		
		
		//System.out.println(set);
		
		//System.out.println(sum);
		
		
		
	
		
		
		//System.out.println(max);
		//System.out.println(count); 
		
		ListIterator<Integer> ls = list.listIterator();
		
		while(ls.hasNext())
		{
		//	System.out.println(ls.next());
		}

	}

}
