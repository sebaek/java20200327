package chap09.lecture.staticMember;

public class Outter {
	NonStatic ns = new NonStatic();
	Static st = new Static();
	
//	static NonStatic sns = new NonStatic();
	static Static nst = new Static();
	
	int instanceF;
	static int staticF;
	
	class NonStatic {
		void method() {
			staticF = 5;
			instanceF = 7;
		}
	}
	
	static class Static {
		void method() {
			staticF = 9;
//			instanceF = 99;
		}
	}
	
	
	void instanceMethod() {
		instanceF = 5;
		staticF = 3;
	}
	
	static void staticMethod() {
//		instanceF = 99;
		staticF = 9;
	}
}






