import java.util.List;

public class PrintAllDuplicatesStringForSmallalphabets {
	
	static void duplicate(String val){
		
		int[] arr1 = new int[26];
		
		for(int i=0;i<val.length();i++) {
			
			arr1[(val.charAt(i))-'a']++;
		}
		
		for(int i=0;i<26;i++) {
			
			if(arr1[i]>1) {
				char ch = (char) (i+'a');
				System.out.println(ch);
			}
			
		}
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		String val = "abcacd";
		duplicate(val);
		

	}

}
