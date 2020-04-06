package chap06.lecture.method.parameter;

public class Method2 {
	
	void method1() {
		// 파라미터 없음
		System.out.println("파라미터없는 메소드");
	}
	
	void method2(int i) {
		// 파라미터가 int 하나
		System.out.println("파라미터가 int 하나");
	}
	
	void triple(int i) {
		int k = 3;
		System.out.println(i * 3);
	}
	
	void plus(int i, int j) {
		int k = 0;
		System.out.println(i + j);
	}
	
	void triple2(double d) {
		System.out.println(d * 3.0);
	}
	
	void max2(boolean b, int... n) {
		
	}
	
	void max(int... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
}









