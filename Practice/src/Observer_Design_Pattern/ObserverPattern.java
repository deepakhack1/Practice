package Observer_Design_Pattern;

public class ObserverPattern {

	public static void main(String[] args) {
	
		ScoreBoard sb = new ScoreBoard();
		ScoreBoard sb1 = new ScoreBoard();
		
		
		Observer observer1 = new Observer_Impl("deepak");
		Observer observer2 = new Observer_Impl("mohan");
		Observer observer3 = new Observer_Impl("shyam");
		
		sb.register(observer1);
		sb.register(observer2);
		sb1.register(observer3);
		
//		observer1.subscribe(sb);
//		observer2.subscribe(sb);
//		observer3.subscribe(sb);
//		
//		observer3.subscribe(sb1);
		
		
		observer1.update();
		
		sb.postMessage("145/4");
		sb1.postMessage("jdd");
	}

}
