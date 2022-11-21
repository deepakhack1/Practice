import java.util.Arrays;
import java.util.Collections;

public class SumOfPairGreaterThanK {
	
	static boolean validate(Integer a[],int b[],int k){
		
		Arrays.sort(a,Collections.reverseOrder());
		
		Arrays.sort(b);
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]+b[i]<k) {
				return false;
			}			
		}
		
		return true;
		
		
		
		
	}

	public static void main(String[] args) {
		
		  Integer a[] = {1, 1, 3};
		    int b[] = {7, 8, 9};
		    int k = 10;
		    
		    System.out.println(validate(a,b,k));
		    
		    

	}

}
