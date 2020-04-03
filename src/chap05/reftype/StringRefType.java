package chap05.reftype;

public class StringRefType {
	public static void main(String[] args) {
		// 05. String
		String a = new String("java");
		String b = new String("java");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String c = "java";
		
		System.out.println(a == c);
		System.out.println(b == c);
		System.out.println(a.equals(c));
		System.out.println(b.equals(c));
		
		String d = "java";
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
}



















