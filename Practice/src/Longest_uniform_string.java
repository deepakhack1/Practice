
public class Longest_uniform_string {
	
	public static int[] longest_String(String s)
	{
		int count = 0;
		int longstart = 0;
		int longlength = 0;
		int start = -1;
		
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==s.charAt(i-1))
			{
				count++;
			}
			
			else
			{
				if(count > longlength)
				{
					longlength = count;
					longstart = start;
				}
				
				start = i;
				count = 1;
				
				
			}
			
			if(count > longlength)
			{
				longlength = count;
				longstart = start; 
			}
			
		}
		
		return new int[] {longstart,longlength};
	}

	public static void main(String[] args) {
		
		String s ="aabbbbbCdAA";
		
		int arr[] = longest_String(s);
		
		for(int x:arr)
		System.out.println(x);
	}

}
