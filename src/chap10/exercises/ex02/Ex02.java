package chap10.exercises.ex02;

public class Ex02 {
	public static void main(String[] args) {
		try {
			System.out.println("메소드 실행 중....");
			
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행");
		}
	}
}
