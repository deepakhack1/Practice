import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Drawable
{
	//public int sum(int a,int b);
	
	public int count_list(List<String> list);
}

public class Lambda_Expression {

	public static void main(String[] args) {
		
List<String> list  = new ArrayList<>();
		
		
		list.add("deepak");
		list.add("ravi");
		list.add("vijay");
		
		
//		Drawable d = new Drawable()
//				{
//					public void sum(int a,int b)
//					{
//						System.out.println(a+b);
//					}
//				};
//
//				
//				
//				d.sum(10,20);
		
		
	//	Drawable d = (a,b)->{return (a+b);};
		
//		System.out.println(d.sum(10,20));
		
		Drawable d = (a->a.size());
		
		System.out.println(d.count_list(list));
		
		
	}

}
