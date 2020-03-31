package chap03.binary.logical;

public class Logical {
	public static void main(String[] args) {
		// AND &&, &
		// true && true → true
		// true && false → false
		// false && true → false
		// false && false → false	
		
		// true & true → true
		// true & false → false
		// false & true → false
		// false & false → false	
//////////////////////////////////////////////////////		
		// OR ||, |
		// true || true → true
		// true || false → true
		// false || true → true
		// false || false → false		

		// true | true → true
		// true | false → true
		// false | true → true
		// false | false → false		

//////////////////////////////////////////////////////////		
		// XOR ^
		// true ^ true → false
		// false ^ true → true
		// true ^ false → true
		// false ^ false → false

//////////////////////////////////////////////////
		
		int i = 0;
		int j = 3;
		
		if (i == 0 && (j++) > 0) {
			System.out.println("결과 true");
		} else {
			System.out.println("결과 false");
		}
		System.out.println("j:" + j);
		
		if (i != 0 && (j++) > 0) {
			System.out.println("결과 true");
		} else {
			System.out.println("결과 false");
		}
		System.out.println("j:" + j);
		
		if (i == 0 & (j++) > 0) {
			System.out.println("결과 true");
		} else {
			System.out.println("결과 false");
		}
		System.out.println("j:" + j);
		
		
		if (i != 0 & (j++) > 0) {
			System.out.println("결과 true");
		} else {
			System.out.println("결과 false");
		}
		System.out.println("j:" + j);
		
		
//		i = 0;
//		j = 3;
//		if (i != 0 & (j / i) > 0) {
//			System.out.println("j를 i로 나눈 값은 양수");
//		}
		
		
		String s = null;
		if (s != null && s.length() > 0) {
			System.out.println("s는 빈 스트링이 아니다.");
		}
		
		
		i = 0;
		j = 3;
		if (i == 0 || (j++) > 0) {
			System.out.println("값은 true");
		} else {
			System.out.println("값은 false");
		}
		System.out.println(j);
	}
}











