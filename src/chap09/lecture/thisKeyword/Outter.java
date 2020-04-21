package chap09.lecture.thisKeyword;

public class Outter {
	int outterF;
	int sameF;
	
	class Nested {
		int nestedF;
		int sameF;
		
		void method() {
			System.out.println(this.nestedF);
			System.out.println(nestedF);
			System.out.println(outterF);
			System.out.println(this.sameF);
			System.out.println(sameF);
			System.out.println(Outter.this.sameF);
		}
	}
}




