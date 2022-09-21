package Linked_List;

import java.util.Scanner;

public class Linked_Ex {

	
	public static Node<Integer> insert_data()
	{
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		Scanner sc = new Scanner(System.in);
		
		int data = sc.nextInt();
		
		while(data != -1)
		{
			Node<Integer> newnode = new Node(data);
			
			if(head == null)
			head = tail = newnode;
			
			else
			{
				tail.next = newnode;
				tail = newnode;
			}
			
			data = sc.nextInt();
			
		}
		
		return head;
		
	}
	
	public static void print(Node<Integer> head)
	{
		
		
		if(head == null)
		{
			System.out.println("empty linked list"); 
		}
		else
		{
			Node<Integer> temp = head;
			
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}
	
	public static int middle(Node<Integer> head)
	{
		if(head == null)
		{
			return -1;
		}
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
		
		
	}
	
	public static Node<Integer> reverse(Node<Integer> head) {
	
			if(head==null || head.next==null)
			{
				return head;
			}
			
			
				Node<Integer> prev = null;
				Node<Integer> curr = head;
				Node<Integer> next = null;
				
				while(curr!=null)
				{
					next = curr.next;
					curr.next = prev;
					prev = curr;
					curr = next;
				
					//print(prev);
					
				}
		
		
			return prev;
	}
	
	public static int delete(int index,Node<Integer> head)
	{
		
		int data = -1;
		if(head == null)
		{
			return -1;
		}
		if(index == 0)
		{
			return head.data;
		}
		
		Node<Integer> curr = head;
		
		
		int count = 0;
		while(curr!=null && count!=index-1)
		{
			curr = curr.next;
			count++;
			
		
		}
		
		if(curr==null)
			return -1;
		
		if(curr.next!=null)
		{
			data = curr.next.data;
			curr.next = curr.next.next;
			
		}
		
		
		return data;
	}
	
	static boolean detectLoop(Node<Integer> head)
	{
		if(head==null || head.next == null)
			return false;
		
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		
		int flag =0;
		
		while(fast!=null && fast.next!=null)
		{
			if(slow==fast)
			{
				flag = 1;
				break;
			}
			
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(flag==1)
			return true;
		
		else
			return false;
		
	}
	
	
	public static void main(String[] args) {
		
		//Linked_Ex e = new Linked_Ex();
		
		
		Node<Integer> head =  insert_data();
		
		//print(head);
		int x = middle(head);
		//System.out.println(x);
		
	//	Node<Integer> head1 = reverse(head);
		//print(head1);
		
		//print(head);
		int val = delete(3,head);
		
		System.out.println(val); 
		
		boolean b =detectLoop(head);
		
		
		
		

	}



}


