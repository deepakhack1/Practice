package GS_Practice;

public class Decimal_conversion {
	
	static String decimal(int arr[])
	{
		float ans = (float) arr[0]/(float) arr[1];
		
		String s = String.valueOf(ans);
		
	
		
		String base = s.substring(0,s.indexOf("."));
		
		
		
		String expo = s.substring(s.indexOf(".")+1,s.length());
		
		int i = 0;
		
		String intermediate = "";
		
		boolean repeat = false;
		
		while(i<expo.length())
		{
			if(intermediate.length() > 0   && intermediate.length()+i < expo.length() && expo.substring(i,intermediate.length()+i).equals(intermediate))
			{
				repeat = true;
				break;
			}
			else
			{
				intermediate = intermediate + expo.charAt(i);
				i++;
				
			}
			
		}
		
		if(repeat)
		{
			return base + ".(" + intermediate + ")";
		}
		else
		{
			return base + intermediate;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3};
		
		String s = decimal(arr);

		System.out.println(s);
	}

}
