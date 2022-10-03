class Stack{
	
	private int capacity;
	private int top;
	private int[] array;
	
	Stack(int capacity){
		this.array = new int[capacity];
		this.capacity = capacity;
		this.top = -1;
	}
	
	public void push(int data) {
		
		if(top<capacity) {
			array[++top]=data;
		}
		else {
			System.out.println("overflow");
		}
	}
	
	public void pull() {
		if(top!=-1) {
			top--;
		}
		else{
			System.out.println("underflow");
		}
	}
	
	public void print() {
		for(int i=0;i<=top;i++) {
			System.out.println(array[i]);
		}
	}
}



public class StackImplementation {

	public static void main(String[] args) {
		
		Stack stack = new Stack(10);
		stack.pull();
		stack.push(10);
		stack.print();
		stack.push(4);
		stack.print();
		

	}

}
