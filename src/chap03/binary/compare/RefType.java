package chap03.binary.compare;

public class RefType {
	public static void main(String[] args) {
		String a = "자바";
		String b = "자바";
		
		boolean r = a == b;
		System.out.println(r);
		
		String c = "자";
		String d = "바";
		String e = c + d;
		
		System.out.println(b);
		System.out.println(e);
		
		r = b == e;
		System.out.println(r);
		System.out.println(b.equals(e));
		
		String f = new String("자바");
		System.out.println(e == f);
		System.out.println(e.equals(f));
		
		int aHashcode = System.identityHashCode(a);
		int bHashcode = System.identityHashCode(b);
		
		int eHashcode = System.identityHashCode(e);
		int fHashcode = System.identityHashCode(f);
		
		System.out.println(aHashcode);
		System.out.println(bHashcode);
		System.out.println(eHashcode);
		System.out.println(fHashcode);
		
		System.out.println();
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());
		
		
	}
}















