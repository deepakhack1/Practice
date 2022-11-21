import java.util.*;

public class ValidParenthesis {
	
	static boolean validate(String s,char arr[]) {
	
		Stack<Character> stack = new Stack<>();
				
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='{'||ch=='['||ch=='(') {
				stack.push(ch);
			}
			
			else {
				if(stack.isEmpty()) {
					return false;
				}
				
				else
				{
					Character ch1 = stack.pop();
					if((ch1=='{' && ch =='}') || (ch1=='[' && ch==']') || (ch1=='(' && ch==')')) {
						continue;
					}
					else
					{
						return false;
					}
					
				}
				
			}
				
		}
		
		if(stack.isEmpty())
		return true;
		
		else
			return false;
		
		
		 
	}
	

	public static void main(String[] args) {
		
	   char arr[] = {'{','}','[',']','(',')'};
		
		String s = "()[]{}";
		
		System.out.println(validate(s,arr));
		
	
		
		

	}

}
