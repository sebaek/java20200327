package chap07.lecture.polymorphism;

public class PolyMorphismApp {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		Cat c = new Cat();
		
		long[] larr = new long[3];
		larr[0] = 3;
		larr[1] = 9379792957L;
		
		Tiger[] tarr = new Tiger[3];
		tarr[0] = new Tiger();
		tarr[1] = new Tiger();
		
		KindaCat[] karr = new KindaCat[3];
		karr[0] = new KindaCat();
		karr[1] = new Tiger();
		karr[2] = new Cat();
		
		
//		Tiger t1 = new Tiger();
//		KindaCat c3 = t1;
		KindaCat c3 = new Tiger();
		
//		int i = 3;
//		long l = i;
		long l = 3;
		
		
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








