
public class LongestUniformSubString {
	
	static int[] longestUniform(String s) {
		
		int count = 0;
		int longestStart=0;
		int longestCount =0;
		int start = 0;
		
		for(int i=1;i<s.length();i++) {
			
			if(s.charAt(i)==s.charAt(i-1)) {
				count++;
			}
			
			else {
				
				if(count > longestCount) {
					longestCount = count;
					longestStart = start;
				}
				count = 1;
				start = i;
			}			
			
		}
		if(longestCount<count) {
			longestCount=count;
			longestStart=start;
		}
		
		return new int[] {longestCount,longestStart};
		
		
	}
	

	public static void main(String[] args) {
		
		String s = "aabbbbbCdAA";
		int[] arr = longestUniform(s);
		for(int x:arr)
			System.out.println(x);
		
	}

}
