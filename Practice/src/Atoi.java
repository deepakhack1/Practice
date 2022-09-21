
public class Atoi {
	
	public static int atoi(String s)
	{
		if(s.length()==0)
			return -1;
		
		int result = 0;
		for(int i=0;i<s.length();i++)
		{
			result = result * 10 + s.charAt(i)-'0';
		}
		
		return result;
		
		
		
	}

	public static void main(String[] args) {
		
		String s ="48";
		
		int a = atoi(s);
		
		System.out.println(a);
	}

}
