
class Table {

	public  static synchronized void sum(int num)
	{
		for(int i=0;i<num;i++)
		{
			System.out.println(i); 
		}
	}

}



class Thread_class1 extends Thread{

Table t;
	
	Thread_class1(Table t)
	{
		this.t= t;
	}
	
	public void run()
	{
		t.sum(40);
	}

}

class Thread_class2 extends Thread{

	Table t;
	
	Thread_class2(Table t)
	{
		this.t= t;
	}
	
	public  void run()
	{
		t.sum(30);
	}

}

public class Demo
{
	public static void main(String args[])
	{
		Table obj = new Table();
		
		Thread_class1 t = new Thread_class1(obj);
		
		Thread_class1 t2 = new Thread_class1(obj);
		
		
		Table obj1 = new Table();
		
		Thread_class2 t1 = new Thread_class2(obj1);
		
		Thread_class1 t3 = new Thread_class1(obj1);
		
		t.start();
		
		t2.start();
		
		t1.start();
		
		t3.start();
	}
}
