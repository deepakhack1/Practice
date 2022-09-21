import java.util.ArrayDeque;
import java.util.Deque;

public class Braces_check {

	  public static boolean check(String s)
	  {
	    if(s.length()==0)
	    {
	      return true;
	    }
	    
	    char arr[] = s.toCharArray();
	    
	    Deque<Character> st = new ArrayDeque<>();
	    
	    for(int i=0;i<s.length();i++)
	    {
	      if(arr[i]=='{'||arr[i]=='['||arr[i]=='(')
	      {
	      st.push(arr[i]);
	      System.out.println(st.peek()); 
	        
	      }
	      
	      
	      
	      else
	      {
	        switch(arr[i])
	        {
	          case '}' :
	            {
	              if(st.pop()=='{')
	              {
	                break;
	              }
	              else
	              {
	                return false;
	              }
	            }
	            
	          case ']' :
	            {
	              if(st.pop()=='[')
	              {
	                break;
	              }
	              else
	              {
	                return false;
	              }
	            }
	            
	          case ')' :
	            {
	              if(st.pop()=='(')
	              {
	                break;
	              }
	              else
	              {
	                return false;
	              }
	            }
	            
	            
	        }
	        
	        
	      }
	      
	    }
	    
	    return st.isEmpty();
	    
	    
	    
	    
	  }
	  
	  public static void main(String[] args) {
	   String s = "{[{}}";
	    boolean b = check(s);
	    
	    System.out.println(b);
	  }

}
