
public class Detect_Capital_Non_optimize {

	static boolean detectCapital(String arr) {
		
		if(arr.length()<2) {
			return true;
		}
		
		if(Character.isUpperCase(arr.charAt(0))  && Character.isUpperCase(arr.charAt(1))) {
			for(int i=2;i<arr.length();i++) {
				if(Character.isLowerCase(arr.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		else
		{
			for(int i = 1;i<arr.length();i++) {
				if(Character.isUpperCase(arr.charAt(i))) {
					return false;
				}
			}
			return true;
		}
		
	}
	
	public static void main(String[] args) {
		
		String arr = "bb";
		System.out.print(detectCapital(arr));

	}

}
