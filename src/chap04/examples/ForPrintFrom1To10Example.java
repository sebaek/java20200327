package chap04.examples;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		int i = 10;
		for (; i >= 1;) {
			System.out.println(i);
			
			i--;
		}
		
		int j = 0, k = 10;
		for (; j < 10 && k > 0; j++, k--) {
			System.out.println(j + ", " + k);
		}
		
		System.out.println(j);
		System.out.println(k);
	}
}










