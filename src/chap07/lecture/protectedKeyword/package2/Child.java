package chap07.lecture.protectedKeyword.package2;

import chap07.lecture.protectedKeyword.package1.Parent;

public class Child extends Parent {
	
	void method() {
//		this.defaultField = 3;
		this.protectedField = 3;
	}

}
