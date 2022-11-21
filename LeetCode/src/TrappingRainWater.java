
public class TrappingRainWater {
	
	static int maxWaterTapped(int arr[]) {
		
		int l = 0;
		int r = arr.length-1;
		int res =0;
		int left_max = Integer.MIN_VALUE;
		int right_max = Integer.MIN_VALUE;
		
		while(l<=r) {
			
			if(arr[l]<=arr[r]) {
				if(left_max <= arr[l])
				{
					left_max = arr[l];
				}
				else
				{
					res += left_max-arr[l];
				}
				
				l++;
			}
			else
			{
				if(arr[r]>=right_max) {
					
					right_max = arr[r];
				}
				else
				{
					res += right_max-arr[r];
				}
			
				r--;
			
			}
			
			
			
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		
		int height[] = {4,2,0,3,2,5};
		
		System.out.print(maxWaterTapped(height));

	}

}
