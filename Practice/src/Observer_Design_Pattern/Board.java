package Observer_Design_Pattern;

public interface Board {

	public void register(Observer obj);
	public void unregister(Observer observer);
	
	public void notifyobserver();


	public Object getUpdate(Observer obj);
}
