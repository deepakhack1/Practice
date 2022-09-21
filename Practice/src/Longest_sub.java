
public class Longest_sub {
	
	public static int longest(String s)
	{

		int res = 0;
		
		for(int i=0;i<s.length();i++)
		{
			
			boolean[] visited = new boolean[256];
			for(int j=i;j<s.length();j++)
			{
				System.out.println(visited[s.charAt(j)]);
				
				if(visited[s.charAt(j)]==true)
				{
					break;
				}
				
				else
				{
					System.out.println("j"+j);
					res = Math.max(res,j-i+1);
					System.out.println(res);
					visited[s.charAt(j)]=true;
				}
			}
			
			visited[s.charAt(i)]=false;
			
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		String s ="geeksforgeeks";
		
		int len = longest(s);
		
		System.out.println(len);

	}

}
