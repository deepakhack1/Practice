import java.util.ArrayList;
import java.util.List;

public class Permutation_LessSpaceComplex {
	
	static void permut(int index,int[] nums,List<List<Integer>> ans){
		
		if(index == nums.length) {
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<nums.length;i++) {
				list.add(nums[i]);
			}
			ans.add(list);
			return;
		}
		
		for(int i=index;i<nums.length;i++) {
			
			swap(i,index,nums);
			permut(index+1,nums,ans);
			swap(i,index,nums);
			
		}
		
	}
	
	static void swap(int i,int index,int[] nums) {
		int t = nums[i];
		nums[i] = nums[index];
		nums[index] = t;
	}

	public static void main(String[] args) {
		int nums[] = {1,2,3};
		List<List<Integer>> ans = new ArrayList<>();
		permut(0,nums,ans);
		System.out.println(ans);
	}

}
