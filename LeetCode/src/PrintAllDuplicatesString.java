
public class PrintAllDuplicatesString {
	
	static void printDuplicate(String val) {
		
		int arr[] = new int[256];
		
		for(int i=0;i<val.length();i++) {
			
			arr[val.charAt(i)]++;			
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>1) {
				System.out.println((char) i);
				
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		
		String val = "abcacdA1341A";
		
		printDuplicate(val);
		
	}

}
