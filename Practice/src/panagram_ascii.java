import java.util.ArrayList;
import java.util.List;

public class panagram_ascii {
	
	
	private static StringBuilder missingCharacters(String s) {
	
		char arr[] = s.toCharArray();
		
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < 25; i++)
		{
		
			if (arr[i] - 'a' != i)
			{
				res.add(i);
			}
		}
		
		System.out.println(res);
		
		
		
		return null;
	}

	public static void main(String[] args) {
		String s = "abcdefghijklmnopqrsvwxyz";
		
		StringBuilder s1 = 	missingCharacters(s);
		

	}

	

}
