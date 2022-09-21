import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

interface Demo1
{
	public String count(List<String> list);
	//public String count(List<String> list,String str);
	//public String count(String str1,String str);
}

public class Funct_inter_list {
	
	public static void main(String args[])

	{
	List<String> list1 = new ArrayList<>();
	list1.add("ddd");
	list1.add("niuu");
	list1.add("deepak");
	
	String str1 = "dhjfj fmfm deepak djjdjd deepak";
	
	String str2[] = str1.split(" ");
	
	Stream<String> stream = Arrays.stream(str2);
	
	char ch = ' ';
	
	long count = stream.filter(s1->s1.equalsIgnoreCase("deepak")).count();
	
	
	//long count1 = str1.chars().filter(c->c==ch).count();
	
//	System.out.println(count1);
	
	
	
	
	String str = "deepak";
	
	//long count = list1.stream().filter(s->s.contains(str)).count();
	
	System.out.println(count);
	
	
	
	Demo1 d = (l)->l.contains(str)?str:null;
	//Demo d = (str2,str3)->str2.
	System.out.println(d.count(list1));
	
	
	}

}
