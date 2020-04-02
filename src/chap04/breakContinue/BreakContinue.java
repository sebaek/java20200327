package chap04.breakContinue;

public class BreakContinue {
	public static void main(String[] args) {

		outter: for (int j = 0; j < 5; j++) {
			System.out.println("j: " + j);
			for (int i = 0; i < 5; i++) {
				System.out.println("i: " + i);
				if (i == 2) {
					break outter;
				}
			}
		}
	}
}
