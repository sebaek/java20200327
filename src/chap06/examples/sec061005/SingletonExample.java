package chap06.examples.sec061005;

public class SingletonExample {
	public static void main(String[] args) {
//		Singleton obj3 = new Singleton();
//		Singleton obj4 = new Singleton();
		
//		Singleton obj3 = Singleton.singleton;
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton객체 입니다.");
		} else {
			System.out.println("다른 Singleton객체 입니다.");
		}
	}
}
