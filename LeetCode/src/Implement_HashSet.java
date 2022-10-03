import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class HashSet{
	
	int MAX = 1000000;
	int array_size = 100;
	List<List<Object>> list;
	List<Object> parent;
	
	public HashSet() {
		list = new ArrayList<>(array_size);
		for(int i=0;i<array_size;i++) {
			list.add(null);
		}
//		list.forEach(i->System.out.println(i));
		parent = new ArrayList<>();
	}
	
	public void add(int key) {
		int index = key%array_size;
		List<Object> parent = list.get(index);
		if(parent == null) {
			 parent = Arrays.asList(key);
			 list.set(index, parent);
		}
		else {
			parent.add(key);
		}
	}
	
	public void remove(int key) {
		int index = key % array_size;
		parent = list.get(index);
		if(parent == null) {
			System.out.println("No key found");
		}
		else {
			for(int i=0;i<parent.size();i++) {
				if(parent.get(i)==(Integer)key) {
					System.out.println(Integer.valueOf(i));
					System.out.println(parent.get(i));
					parent.remove(key);
					System.out.println("removed");
					return;
				}
			}
			
			System.out.println("No key found");
		}	
	}
	
	public boolean containsKey(int key) {
		int index = key % array_size;
		parent = list.get(index);
		if(parent == null) {
			return false;
		}
		else {
			boolean b = parent.stream().anyMatch(i->i.equals(key));
			return b;
		}
	}
	
	
	
}



public class Implement_HashSet {

	public static void main(String[] args) {
	
		HashSet set = new HashSet();
//		set.add(2);
//		set.add(2);
		set.add(1000);
		set.add(5);
		set.remove(3);
		System.out.println(set.containsKey(2));
		set.containsKey(3);
		set.remove(2);
		System.out.println(set.containsKey(2));	
	}

}
