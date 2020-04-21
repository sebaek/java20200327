package chap09.lecture.localClass;

public class Outter {
	Object method(final int param) {
		final int localVar = 3;
		class Local {
			int i = localVar;
			int p = param;
		}
		
		Local l = new Local();
		
		return l;
	}
}
