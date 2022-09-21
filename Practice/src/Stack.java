
public class Stack {

	
	int MAX_LIMIT = 100;
	int arr[] = new int[MAX_LIMIT];
	int top = -1;
	
	public void push(int data)
	{
		if(top!=arr.length-1)
		arr[++top]=data;
		
		else
			System.out.println("stack overflow");
	}
	
	public void pop()
	{
		if(top==-1)
		System.out.println("underflow");
		
		else
		top  = top - 1;
	}
	
	public void print()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		Stack st = new Stack();
		
		st.push(5);
		st.push(7);
		st.push(8);
		
		
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		
		st.print();

	}

}
