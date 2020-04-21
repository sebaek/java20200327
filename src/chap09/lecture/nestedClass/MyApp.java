package chap09.lecture.nestedClass;

public class MyApp {
	public static void main(String[] args) {
		NestedClass.staticM = 3;
		NestedClass n = new NestedClass();
		n.instanceM = 3;

		NestedClass.StaticClass ns = new NestedClass.StaticClass();
//		NestedClass.OtherClass no = new NestedClass.OtherClass();
		NestedClass nc = new NestedClass();
		NestedClass.OtherClass no = nc.new OtherClass();
		
	}
}
