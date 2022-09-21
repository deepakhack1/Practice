package Tree;

public class BST {

	Node<Integer> root;
	
	BST()
	{
		root = null;
	}
	
	public  void insert(int data)
	{
		root = insertrec(data,root);
	}
	
	public Node<Integer> insertrec(int data,Node<Integer> root)
	{
		if(root == null)
		{
			root = new Node<>(data);
			//print();
			return root;
		}
		
		if(root.data >= data)
		{
			root.left = insertrec(data,root.left);
		}
		else
		{
			root.right = insertrec(data,root.right);
		}
		
		
		return root;
		
		
		
	}
	
	public void print()
	{
		if(root == null)
		{
			System.out.println("empty tree");
		}
		else
		{
			printrec(root);
		}
		
		
	}
	
	public void printrec(Node<Integer> root)
	{
		if(root!=null)
		{
			System.out.println(root.data);
		printrec(root.left);
		printrec(root.right);
		
	
		}
	}
	
	
	public static void main(String[] args) {
	
		BST bst = new BST();
		
		bst.insert(9);
		bst.insert(10);
		bst.insert(11);
		
		bst.print();
	}

}
