package chap09.lecture.nestedClass;

public class NestedClass {
	static int staticM;
	int instanceM;
	
	static class StaticClass {
		int field;
		static int staticField;
	}

	class OtherClass {
		int field;
//		static int staticField;
		
		OtherClass() {
			
		}
		
		void method() {
			
		}
	}
	
	void method() {
		class LocalClass {
			int field;
//			static int staticField;
		}
		
		LocalClass lc = new LocalClass();
		
	}
}


























