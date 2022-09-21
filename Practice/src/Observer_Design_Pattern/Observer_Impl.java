package Observer_Design_Pattern;

public class Observer_Impl implements Observer{

	private String name;
	Board board;
	
	
	public Observer_Impl(String name)
	{
		this.name = name;
	}
	
	public void update()
	{
		String msg = (String) board.getUpdate(this);
		if(msg == null)
			System.out.println("no new msg");
		
		else
		System.out.println(this.name+"consuming msg "+msg);
	}

	@Override
	public void subscribe(Board board) {
	
		this.board = board;
		
	}
	
}
