package chap06.lecture.staticKeyword;

public class MyApp {
	public static void main(String[] args) {
		
		System.out.println(MyClass.j);
		
		System.out.println();
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		
		c1.i = 30;
		c2.i = 99;
		
		System.out.println(c1.i);
		System.out.println(c2.i);
		
		System.out.println();
		c1.j = 77;
		c2.j = 100;
		
		System.out.println(c1.j);
		
		MyClass.j = 900;
		
		System.out.println(c1.j);
		System.out.println(c2.j);
		System.out.println(MyClass.j);
		
		System.out.println();
		c1.method();
		c2.method();
		c1.method2();
		c2.method2();
		
		MyClass.method2();
	}
}










