import java.util.Arrays;

public class Remove_Consecutive_Characters {
	
	static String removeConsecutive(String s) {
		
		if(s.length()==1) {
			return s;
		}
		else if(s.charAt(0)==s.charAt(1)) {
			return removeConsecutive(s.substring(1)); 
		}
		else {
			return s.charAt(0)+ removeConsecutive(s.substring(1));	
		}	
	}
	

	static String removeConsecutiveOptimal(String s) {
		if(s.length()<2) {
			return s;
		}
		
		int j=0;
		
		char ch[] = s.toCharArray();
		
		for(int i=1;i<s.length();i++) {
			
			if(ch[i]!=ch[j]) {
				j++;
				ch[j]=ch[i];
			}	
		}
		
		 return String.valueOf(Arrays.copyOfRange(ch, 0, j+1));
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		String s = "aabaa";
		
		System.out.println(removeConsecutive(s));
		System.out.println(removeConsecutiveOptimal(s));
		
	}

}
