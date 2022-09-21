
public class Decimal_Conversion {
	
	static String decimalConversion(int arr[])
	{
		float ans = (float) arr[0]/(float) arr[1] ;
		
		String val = String.valueOf(ans);
		
		String base = val.substring(0,val.indexOf(".")+1);
		
		String expo = val.substring(val.indexOf(".")+1,val.length());
		
		int i = 0;
		
		String intermediate = "";
		
		boolean repeated = false;
		
		while(i<expo.length())
		{
			if(intermediate.length()>0 && (i+intermediate.length() < expo.length()) && expo.substring(i,i+intermediate.length()).equals(intermediate))
			{
				repeated = true;
				break;
			}
			else
			{
				intermediate = intermediate + expo.charAt(i);
				i++;
			}
			
		}
		
		if(repeated)
		{
			return base + "(" + intermediate + ")" ;
		}
		else
		{
			return base + intermediate;
		}
		
		
		
	
	}
	

	public static void main(String[] args) {
		
		int arr[] = {10,3};
		
	String s = decimalConversion(arr);
	
	System.out.println(s);

	}

}
