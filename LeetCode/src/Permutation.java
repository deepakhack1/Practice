import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	
	static void permutaionRecur(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] freq) {
		if(ds.size()==nums.length){
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i=0;i<nums.length;i++) {
			if(!freq[i]) {
				freq[i]=true;
				ds.add(nums[i]);
				permutaionRecur(nums,ans,ds,freq);
				ds.remove(ds.size()-1);
				freq[i]=false;
			}
		}	
	}
	
	static List<List<Integer>> permut(int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean freq[] = new boolean[nums.length];
		permutaionRecur(nums,ans,ds,freq);
		return ans;
		
	}
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,3};
		List<List<Integer>> ans = permut(nums);
		System.out.println(ans);
		
		
		
	}

}
