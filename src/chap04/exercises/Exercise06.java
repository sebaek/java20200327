package chap04.exercises;

public class Exercise06 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (4-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}












