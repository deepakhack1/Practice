
public class Reverse_string {
	
	/*
	public static String reverse(String s)
	{
		StringBuilder s1 = new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1.append(s.charAt(i));
		}
		
		return s1.toString();
	}
	*/

	public static String reverse(String s)
	{
		char ch[] = s.toCharArray();
		
		for(int i=0;i<s.length()/2;i++)
		{
			char ch1 = ch[i];
			ch[i] = ch[s.length()-1-i];
			ch[s.length()-1-i] = ch1;
		}
		
		String s1 = new String(ch);
		
		return s1;
		
	}
	
	static String recReverse(String s)
	{
		if(s.length()==0)
			return null;
		
		if(s.length()==1)
			return s;
		
		
		
			return 	recReverse(s.substring(1)) + s.charAt(0);
			
			//return s;
		
	}
	
	
	public static void main(String[] args) {
		
		String s = "deepak";
		
		s = reverse(s);
		
		//System.out.println(s);
		
		String s1 = "kapeed";
		
		s1 = recReverse(s1);
		
		System.out.println(s1);
		
		
	}

}
