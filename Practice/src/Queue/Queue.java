package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {

	int capacity;
	int front,rear;
	int arr[];
	int size;
	
	Queue(int capacity)
	{
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity-1;
		arr = new int[this.capacity];
	}
	
	public void enqueue(int data)
	{
		if(isFull())
		{
			System.out.println("overflow");
			return;
		}
		
		this.rear = (this.rear + 1)%capacity;
		this.size = this.size + 1;
		arr[this.rear]=data;
	}
	
	public boolean isFull()
	{
	     return this.size>this.capacity;
	    	 
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("underflow");
			return;
		}
		
		this.front = (this.front+1)%capacity;
		this.size = this.size - 1;
		
			
	}
	
	public boolean isEmpty()
	{
	     return this.size==0;
	    	 
	}
	
	public void print()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Queue queue = new Queue(1000);
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		
		//queue.print();
		
		queue.dequeue();
		queue.dequeue();
		
		queue.print();
		

	}

}
