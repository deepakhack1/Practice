
public class Join_method extends Thread{
	
	static Thread j1;
	
	public void run() 
	{
		try {
			//j1.join();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i =20;i<30;i++)
		{
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
	
		Join_method j = new Join_method();
		
		String name = Thread.currentThread().getName();
		
		System.out.println(name);
		
		Join_method.j1 = Thread.currentThread();
		
		j.join();
		
		j.start();
		
		
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			
			Thread.sleep(1000);
		}
		
		

	}

}
