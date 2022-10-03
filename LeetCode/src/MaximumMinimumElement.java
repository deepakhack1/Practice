
public class MaximumMinimumElement {
	
	static class Pair{
		int min;
		int max;
	}
	
	static Pair maxAndMin(int[] arr) {
		
		Pair maxMin = new Pair();
	
		if(arr.length==1) {
			maxMin.max = arr[0];
			maxMin.min = arr[0];	
			return maxMin;
		}
		
		if(arr[0]>arr[1]) {
			maxMin.min = arr[1];
			maxMin.max = arr[0];
		}
		else {
			maxMin.min = arr[0];
			maxMin.max = arr[1];
		}
		
		for(int i=2;i<arr.length;i++) {
			
			if(maxMin.max<arr[i]) {
				maxMin.max = arr[i];
			}
			else if(maxMin.min>arr[i]) {
				maxMin.min = arr[i];
			}
			
		}
		
		//return maxMin;
		return maxMin;	
	}

	public static void main(String[] args) {
		
		int arr[] = {3,5,6,9,1,10,2};
		
		Pair maxMin = maxAndMin(arr);
		System.out.println("max element is "+maxMin.max);
		System.out.println("min element is "+maxMin.min);
		
	}

}
