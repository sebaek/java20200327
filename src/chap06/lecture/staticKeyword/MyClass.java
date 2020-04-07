package chap06.lecture.staticKeyword;

public class MyClass {
	static int j;// static field, class field
	
	int i; // instance field
	
	static {
		j = 98765;
	}
	
	MyClass() {
		// 인스턴스 초기화 하는 코드들 작성.
	}
	
	void method() {
		System.out.println(this.i);
		System.out.println("인스턴스 메소드");
	}

	// static method, class method
	static void method2() {
//		method();
//		System.out.println(i);
//		System.out.println(this.i);
//		System.out.println(this.j);
		System.out.println("스태틱 메소드");
	}
}







