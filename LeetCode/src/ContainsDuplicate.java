import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	static boolean containsDuplicate(int arr[]) {
	
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i:arr) {
			if(!map.containsKey(i)) {
				map.put(i,1);
			}
			else
			{
				
				map.put(map.get(i),2);
			}
		}
		
		for(Map.Entry<Integer,Integer> map1 : map.entrySet()) {
			if(map1.getValue()==2) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,2,4};
		
		boolean  b = containsDuplicate(arr);
		System.out.println(b);

	}

}
