package chap06.lecture.finalKeyword;

public class FinalKeyword {
	// 변수 앞에 붙으면
	// 값을 할당할 기회를 한 번만 갖는다.
	final int i;
	
	FinalKeyword() {
		i = 90;
	}
	
	
	void method(final int k) {
//		k = 90;
		final int i;
		i = 30;
//		i = 20;
		final int j = 60;
//		j = 70;
		
	}
}







