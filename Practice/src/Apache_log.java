import java.util.HashMap;
import java.util.Map;

public class Apache_log {
	
	static String mostUsedIP(String str[])
	{
		String str1[];
		
		String str2 = null;
		
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			str1 = str[i].split("-");
			str1[0]=str1[0].trim();
			
			
			map.compute(str1[0],(k,v)->(v==null)?1:++v);
		}
		
	
		
		int max = Integer.MIN_VALUE;
		for(Map.Entry<String,Integer> map1 : map.entrySet())
		{
			
			
			if(max<map1.getValue())
			{
				max = map1.getValue();
				str2 = map1.getKey();
			}
		}
		
		return str2;
	}

	public static void main(String[] args) {
		
		String lines[] = new String[] {
		        "10.0.0.3 - log entry 1 11",
		        "10.0.0.2 - log entry 2 213",
		        "10.0.0.3 - log entry 133132" };
		
		String str = mostUsedIP(lines);
		
		System.out.println(str);
		

	}

}
