package chap07.lecture.superKeyword;

public class Child extends Parent {
	public int j;
	
	@Override
	public void method() {
		super.method();
		System.out.println("재정의된 자식 클래스 메소드");
	}
	
	public void method2() {
		System.out.println("자식 클래스 메소드2");
		System.out.println(super.i);
		super.method();
		System.out.println(this.i);
		this.method3();
	}
	
	public void method3() {
		
	}
}
