
public class Run_length_encoding {
	
	public static StringBuilder runLength(String s)
	{
		if(s.length()==0)
		return null;
		
		int count = 0;
		StringBuilder sb = new StringBuilder();
		char pre = s.charAt(0);
		
		for(int i=0;i<s.length();i++)
		{
			if(pre==s.charAt(i))
				count++;
			
			else
			{
				sb.append(s.charAt(i-1));
				sb.append(count);
				pre = s.charAt(i);
				count = 1;
			}
		}
		
		sb.append(s.charAt(s.length()-1));
		sb.append(count);
		
		return sb;
		
		
	}

	public static void main(String[] args) {
		
		String s = "aabbbccccc";
		
		StringBuilder s1 = runLength(s);
		
		System.out.println(s1);
	}

}
