package chap02.typecasting;

public class Explitcit {
	public static void main(String[] args) {
		// byte → short → int → long → float → double
		//         char ↗
		
		int i = 103029770;
		byte b = (byte) i;
		System.out.println(i);
		System.out.println(b);
		
		long l = 300;
		i = (int) l;
		System.out.println(l);
		System.out.println(i);
		
		int intValue = 'A';
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		double d = 3.14;
		int i3 = (int) d;
		System.out.println(i3);
		
		
		
		
		
	}

}









