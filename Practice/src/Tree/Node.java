package Tree;

public class Node<T> {
	
	int data;
	Node<T> left,right;
	
	Node(int data)
	{
		this.data = data;
		this.left = this.right = null;
	}

}
