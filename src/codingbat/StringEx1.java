package codingbat;

public class StringEx1 {
	public static void main(String[] args) {
		// charAt(int index)
		String s1 = "samsung";
		String s2 = "apple";
		
		char c = s1.charAt(0);
		System.out.println(c);
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(0));
		
		System.out.println(s1.charAt(1));
		
		System.out.println(s1.charAt(6));
		System.out.println(s2.charAt(4));
		
//		System.out.println(s1.charAt(7));
//		System.out.println("출력해주세요.");
		
		// length()
		System.out.println("길이");
		int s1Length = s1.length();
		int s2Length = s2.length();
		System.out.println(s1Length);
		System.out.println(s2Length);
		
		// substring(int begin, int end)
		String sub1 = s1.substring(1, 3);
		System.out.println(sub1);
		
		String s3 = "jkji38gjbh39gh2wl3jkbhb3hg";
		int s3Length = s3.length();
		
		String sub3 = s3.substring(s3Length - 2, s3Length);
		System.out.println(sub3);
		
		// substring(int begin)
		sub3 = s3.substring(s3Length - 2);
		System.out.println(sub3);
		
		
		// indexOf(String s)
		s1 = "자바스크립트";
		int i = s1.indexOf("스크립트");
		System.out.println(i);
		
		s1 = "990000-1234-56-7";
		i = s1.indexOf("-");
		System.out.println(i);
		i = s1.lastIndexOf("-");
		System.out.println(i);
		
		
		// replace(String old, String new);
		s1 = "나는 아이폰, 아이폰 있다";
		String news1 = s1.replace("아이폰", "갤럭시");
		System.out.println(news1);
		System.out.println(s1);
		
		// toLowerCase(), toUpperCase()
		s1 = "javaSCRIPT";
		String ls1 = s1.toLowerCase();
		System.out.println(ls1);
		System.out.println(s1);
		
		String us1 = s1.toUpperCase();
		System.out.println(us1);
		System.out.println(s1);
		
		// equals(String s)
		s1 = "자바";
		s2 = "자바";
		System.out.println(s1.equals(s2));
		s1 = "자바";
		s2 = "JAVA";
		System.out.println(s1.equals(s2));
		s1 = "자바";
		s2 = " 자바 ";
		System.out.println(s1.equals(s2));
		
		
		// trim();
		s1 = "  자  바 ";
		String ns1 = s1.trim();
		System.out.println(ns1);
		System.out.println(s1);
		
		
	}
}



















