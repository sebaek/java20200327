package chap04.examples;

public class IfDiceExample2 {
	public static void main(String[] args) {
		// 두 개의 주사위를 굴려서
		// 값이 같으면 당첨, 아니면 낙첨.
		int num1;
		int num2;
		
		num1 = (int) (Math.random() * 6) + 1;
		num2 = (int) (Math.random() * 6) + 1;

		System.out.println(num1 + ", " + num2);
		if (num1 == num2) {
			System.out.println("당첨!!!!!");
		} else {
			System.out.println("당첨되지 않았습니다!!!!");
		}
	}
}










