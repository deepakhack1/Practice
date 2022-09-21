package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class A
{
	
	static String str;
	
	public void A()
	{
		System.out.println("d");
		str = "hh";
	}
	
	
public static void main(String args[]){
	
	try
	{
	Float f1 = new Float("3.0");
	int x = f1.intValue();
	byte b = f1.byteValue();
	double d = f1.doubleValue();
	System.out.println(x+b+d);
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	List<Integer> list = new ArrayList<>();
	
	list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	
}



}