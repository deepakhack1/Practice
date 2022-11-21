
public class BestTimeBuySellStock {
	
	static int findProfitByBrute(int arr[]) {
		
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					if(max < (Math.abs(arr[j]-arr[i]))){
						max = Math.abs(arr[j]-arr[i]);
					}
					
				}
				
			}
			
		}
		
		return max;
		
	}
	
	static int findProfitByOptimal(int arr[]) {
		
		int least_so_far = Integer.MAX_VALUE;
		int current_max = 0;
		int global_max = 0;
	
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<least_so_far) {
				least_so_far = arr[i];
			}
			
		current_max = Math.abs(least_so_far - arr[i]);
		
		if(global_max < current_max) {
			global_max =current_max;
		}
		
	}
			
		
		
		return global_max;
	}
	

	public static void main(String[] args) {
		
		int prices[] = {7,1,5,3,6,4};

		System.out.println(findProfitByBrute(prices));
		System.out.println(findProfitByOptimal(prices));

	}

}

