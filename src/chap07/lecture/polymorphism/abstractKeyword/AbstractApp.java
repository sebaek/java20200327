package chap07.lecture.polymorphism.abstractKeyword;

public class AbstractApp {
	public static void main(String[] args) {
//		KindaCat k1 = new KindaCat();
//		k1.cry();
		
		Tiger t = new Tiger();
		Cat c = new Cat();
		t.cry();
		c.cry();
	}
}
