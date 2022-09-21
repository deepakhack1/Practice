import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pascal_traingle {
	
	static int pascalFind(int col,int row)
	{
		HashMap<List<Integer>,Integer> map = new HashMap<>();
		
		List<Integer> list = new ArrayList<>();
		
		list.add(col);
		list.add(row);
		
		if(!map.containsKey(list))
		{
			if(row==0 || row==col || col==0 )
				map.put(list,1);
			
			else
			{
				map.put(list, pascalFind(col,row-1)+pascalFind(col-1,row-1));
			}
		}
		
		return map.get(list);
		
		
	}

	public static void main(String[] args) {
		
		int x = pascalFind(5,6);
		
		System.out.println(x);

	}

}
