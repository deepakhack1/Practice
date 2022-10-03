import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSumProblem {
	
	static int[] findIndices(int num[],int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<num.length;i++) {
			int delta = target-num[i];
			if(map.containsKey(delta)) {
				return new int[] {i,map.get(delta)};
			}
			map.put(num[i],i);
		}
		
		return new int[] {};
		
		
	}

	public static void main(String[] args) {
		
		int num[] = {2,7,11,15};
		int target = 9;
		
		int list[] = findIndices(num,target);
		System.out.println(list[0]+" "+list[1]);
		

	}

}
