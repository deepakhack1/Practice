
public class Magic_potion {
	
	static String magicPotion(String s)
	{
		if(s.length()==0)
			return null;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(s.charAt(0));
		
		for(int i=1;i<s.length();i++)
		{
			if(i*2 < s.length())
			{
				String compare = s.substring(0,i);
				if(compare.equals(s.substring(i,i*2)))
				{
					i = i*2-1;
					sb.append("*");
				}
				else
				{
					sb.append(s.charAt(i));
				}
			}
			else
			{
				sb.append(s.charAt(i));
			}
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		
		String s = "ABABCABABCE";
		
	 String s1 = magicPotion(s);
	 
	 System.out.println(s1);

	}

}
