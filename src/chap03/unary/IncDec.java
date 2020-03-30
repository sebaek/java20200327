package chap03.unary;

public class IncDec {
	public static void main(String[] args) {
		// 증가연산자(increment) ++ 
		// 감소연산자(decrement) --
		
		int i = 10;
		i++;
		
		System.out.println(i);
		
		i--;
		System.out.println(i);
	
		
		--i;
		System.out.println(i);
		
		++i;
		System.out.println(i);
		
		
		int x = 1;
		int y = 1;
		int r1 = ++x + 10;
		int r2 = y++ + 10;
		
		System.out.println(r1);
		System.out.println(r2);
	}
}


















