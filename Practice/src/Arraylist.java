import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<>();
		
		List<String> list = Arrays.asList("dd","ddd");
		
		/*
		list.add("deepak");
		list.add("ravi");
		list.add("vijay");
		*/
		
	//	list.forEach(a->System.out.println(a));
		
		ListIterator<String> lt = list.listIterator(list.size());
		
		while(lt.hasPrevious())
		{
			//System.out.println("hello");
			System.out.println(lt.previous());
		}
		

	}

}
