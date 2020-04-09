package chap07.lecture.polymorphism;

public class PolyMorphismApp {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Cat c = new Cat();
		
		t.cry();
		c.cry();
		
		KindaCat c1 = t;
		KindaCat c2 = c;
		
		c1.cry();
		c2.cry();
		
//		t = c1;
//		c = c2;
		
	}
}








