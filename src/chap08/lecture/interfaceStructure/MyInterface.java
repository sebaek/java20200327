package chap08.lecture.interfaceStructure;

public interface MyInterface {
	// 필드 (public static final)
	public static final int i = 3;
	int j = 4;
	
	// 추상메소드 (public abstract)
	int methodName(int i);
	public abstract int methodName2();
	
	// static 메소드 (public)
	static void methodName3() {
		System.out.println("스태틱 메소드");
	}
	
	public static void methodName5() {
		System.out.println("스태틱 메소드");
	}
	
	// default 메소드 (public)
	default void methodName4() {
		System.out.println("인스턴스 디폴트 메소드");
	}
	
	public default void methodName6() {
		System.out.println("인스턴스 디폴트 메소드");
	}
	
}





















