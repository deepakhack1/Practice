
public class IntegerToRoman {

	static String coversion(int num)
	{
		String thousands[] = {"","M","MM","MMM"};
		String hundereds[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String tens[] = {"","X","XX","XXX","XL","LX","LXX","LXXX","XC"};
		String ones[] = {"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
		
		return thousands[num/1000]+hundereds[((num%1000)/100)]+tens[((num%100)/10)]+ones[(num%10)];
		
	}
	
	
	public static void main(String[] args) {
		
		int num = 2567;
		
     System.out.println(coversion(num));
		
	}

}
