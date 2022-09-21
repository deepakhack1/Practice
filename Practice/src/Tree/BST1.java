package Tree;

import java.util.ArrayList;
import java.util.List;

public class BST1 {

	static class BST
	{
		private Node root ;
		
		public BST()
		{
			
			root = new Node();
			
		}
		
		//@SuppressWarnings("null")
		public Node putInTree(Node node,int value)
		{
			
			if(node.val==null)
			{
				node.val = value;
				return  node;
			}
			else if(node.val<value)
			{
				if(node.right == null)
				{
					node.right = new Node();
					node.right.val = value;
					return node;
				}
				
				else
				{
				
				node.right = putInTree(node.right,value);
				}
			}
			else
			{
				if(node.left == null)
				{
					node.left = new Node();
					node.left.val = value;
					return node;
				}
				else
				{
				node.left = putInTree(node.left,value);
				}
			}
			
			return node;
		}
		
		
		
		
		
		public void put(int data)
		{

			
			root = putInTree(root,data);
		}
		
		
		public boolean findVal(Node node,int val)
		{
			if(node==null)
				return false;
			
			else if(node.val == val)
			{
				return true;
			}
			else
			{
				if(node.val>=val)
					findVal(node.left,val);
				
				else
					findVal(node.right,val);
			}
			
			return false;
			
			
		}
		
		
		public List<Integer> inorder()
		{
			 final List<Integer> acc = new ArrayList<>();
			 inorderTraversal(root,acc);
			 return acc;
		}
		
		public void inorderTraversal(Node node,List<Integer> acc)
		{
			
			if(node!=null)
			{
			inorderTraversal(node.left,acc);
			acc.add(node.val);
			inorderTraversal(node.right,acc);
			}
			
		}
		
		public boolean contains(int val)
		{
			return findVal(root,val);
		}
		
		
	
	
	
	private static class Node
	{
		Integer val;
		Node left;
		Node right;
	}
	
	}
	
	public static void main(String[] args) {
	
		BST bst = new BST();
		
		bst.put(4);
		bst.put(6);
	
		
		bst.put(8);
		bst.put(1);
		
		int val =  4;
	   
		boolean b = bst.contains(val);
	    List<Integer> list =bst.inorder();
	    
	    System.out.println(list);
	    
	    System.out.println(b);
	   
	    
		
		
	}

}
