import java.util.function.Predicate;

public class Detect_Capital_Optimized {

	
	static boolean detectCapital(String s) {
		
		if(s.length()<2) {
			return true;
		}
		
		Predicate<Character> correctCase = Character::isLowerCase;
		
		if((!correctCase.test(s.charAt(0))) && (!correctCase.test(s.charAt(1)))) {
			correctCase = Character::isUpperCase;	
		}
		
		for(int i=1;i<s.length();i++) {
			if(!correctCase.test(s.charAt(i))) {
				return false;
			}	
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s = "bbb";
		System.out.println(detectCapital(s));

	}

}
