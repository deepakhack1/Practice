
public class NumberToWord {
	
	
	static void convert(char num[]) {
		if(num.length>4) {
			System.out.println("invalid");
		}
		
		int len = num.length;
		
		 String[] single_digits = new String[] {
		            "zero", "one", "two",   "three", "four",
		            "five", "six", "seven", "eight", "nine"
		        };
		  
		        /* The first string is not used, it is to make
		            array indexing simple */
		        String[] two_digits = new String[] {
		            "",          "ten",      "eleven",  "twelve",
		            "thirteen",  "fourteen", "fifteen", "sixteen",
		            "seventeen", "eighteen", "nineteen"
		        };
		  
		        /* The first two string are not used, they are to
		         * make array indexing simple*/
		        String[] tens_multiple = new String[] {
		            "",      "",      "twenty",  "thirty", "forty",
		            "fifty", "sixty", "seventy", "eighty", "ninety"
		        };
		  
		        String[] tens_power
		            = new String[] { "hundred", "thousand" };
		
		int x = 0;
		while(x<num.length) {
			if(len>=3) {
				if(num[x]-'0'!=0) {
					System.out.print(single_digits[num[x]-'0']+" ");
					System.out.print(tens_power[len-3]+" ");
					
				
				}
				len--;
			}
				else {
					if(num[x]-'0'==1) {
						int sum = num[x]-'0' + num[x+1]-'0';
						System.out.print(two_digits[sum]);
						return;
					}
					
					else if((num[x]-'0'== 2) && (num[x+1]-'0'== 0)) {
						System.out.print("twenty");
						return;
					}
					
					else {
						int i = num[x]-'0';
						if(i>0)
						System.out.print((tens_multiple[i])+" ");
						
						else
							System.out.print("");
						
						++x;
						
						if(num[x]-'0'!=0)
						{
							System.out.print(single_digits[num[x]-'0']);
						}
						
					}
					
					
				}
			++x;	
			}
		
			
		
		
	}
	

	public static void main(String[] args) {
		
		int num = 2441;
		String s = String.valueOf(num);
		
		convert(s.toCharArray());
		
	}

}
