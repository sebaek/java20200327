package chap07.examples.sec070701;

public class ChildExample {
	public static void main(String[] args) {
		// 그림. 11. 다형성 예제1
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3();
	}
}
