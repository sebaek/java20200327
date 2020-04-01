package chap03.binary.bitwise;

public class Bitwise {
	public static void main(String[] args) {

		// &, |, ^, ~

		// & (둘다 1일 경우만 1, 나머지는 모두 0)
		int a = 45;
		int b = 25;

		int c = a & b;

		System.out.println(c);
		
		// | (둘다 0일 경우만 0, 나머지 모두 1)
		c = a | b;
		System.out.println(c);
		
		// ^ (둘이 다르면 1, 같으면 0)
		c = a ^ b;
		System.out.println(c);
		
		// ~ (비트를 반대로 변경)
		c = ~a;
		System.out.println(c);

		
		
		// >>, <<, >>>
		
		// << (모든 비트를 왼쪽으로 몇 칸씩 이동)
		a = 1;
		c = a << 1;
		System.out.println(c);
		c = a << 3;
		System.out.println(c);
		
		a = -8;
		c = a << 3;
		System.out.println(c);
		
		
		// >> (모든 비트를 오른쪽으로 몇 칸씩 이동) 채우는 비트가 부호비트
		a = 16;
		c = a >> 1;
		System.out.println(c);
		
		c = a >> 3;
		System.out.println(c);
		
		a = -8;
		c = a >> 1;
		System.out.println(c);
		
		
		// >>> (모든 비트를 오른쪽으로 몇 칸씩 이동) 채우는 비트가 0
		a = -8;
		c = a >>> 1;
		System.out.println(c);
	}
}


















