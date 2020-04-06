package chap06.lecture.method.parameter;

public class Method2App {
	public static void main(String[] args) {
		Method2 m1 = new Method2();
		m1.method1();
		m1.method2(3);
		m1.triple(9);
		m1.plus(9, 10);
		m1.triple2(3.14);
		m1.triple2(3L);
		
		m1.max(1, 2, 3, 4);
		m1.max(new int[] {6, 7, 8});
//		m1.max(1, 2, 3, 4,5, 6, 7, 8, 10);
	}
}













