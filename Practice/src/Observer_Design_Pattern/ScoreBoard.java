package Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class ScoreBoard implements Board {

	List<Observer> list;
	private String message;
	private boolean changed;
	
	public ScoreBoard()
	{
		this.list = new ArrayList<Observer>();
	}
	
	
	@Override
	public void register(Observer obj) {
		
		if(obj == null)
			throw new NullPointerException();
		
		else
			list.add(obj);
	}

	@Override
	public void unregister(Observer observer) {
		
		if(list.contains(observer))
			list.remove(observer);
	}

	@Override
	public void notifyobserver() {
		if(!changed)
			return;
		
		else
		{
			for(Observer observer : list)
			{
				observer.update();
			}
		}
		
	}

	@Override
	public Object getUpdate(Observer obj) {
		
		return this.message;
	}
	
	public void postMessage(String msg)
	{
		System.out.println("msg posted"+msg);
		this.message = msg;
		this.changed = true;
		notifyobserver();
		
	}

}
