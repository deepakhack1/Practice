
public class Anagram {
	
	public static boolean anagramTest(String s1,String s2)
	{
		if(s1.length()==0 || s2.length()==0 || s1.length()!=s2.length())
		{
			return false;
		}
		
		int count[] = new int[256];
		
		for(int i=0,j=0;i<s1.length();i++,j++)
		{
			count[s1.charAt(i)]++;
			count[s2.charAt(j)]--;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				return false;
			}
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		
		String s1 = "deepak";
		String s2 = "eefapk";
		
		boolean b = anagramTest(s1,s2);
		
		System.out.println(b);
		
	}

}
