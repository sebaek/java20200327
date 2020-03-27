package chap02.datatype;

public class Character1 {
	public static void main(String[] args) {
		// 2byte 크기
		// 0 ~ 65535
		char c;
		c = 'A'; // 65
		System.out.println(c);
		
		c = '\u0041';
		System.out.println(c);
		
		c = '\uAC00';
		System.out.println(c);
		
		c = '\uac01';
		System.out.println(c);
		
		int i = c;
		System.out.println(i);
	}
}








