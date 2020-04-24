package chap11.examples.sec110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("chap11.examples.sec110603.SendAction");
//			Class clazz = Class.forName("chap11.examples.sec110603.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
