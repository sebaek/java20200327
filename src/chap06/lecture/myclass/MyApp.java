package chap06.lecture.myclass;

public class MyApp {
	public static void main(String[] args) {
		MyClass c1;
		c1 = new MyClass();
		
		MyClass c2 = new MyClass();
		
		System.out.println(c1 == c2);
		
//		System.out.println(c1.field1);
//		System.out.println(c1.method1());
	}
}
