package chap05.array;

public class CopyUtil {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};
		int[] b = new int[5];
		
		System.arraycopy(a, 1, b, 2, 2);
		
		for (int v : b) {
			System.out.println(v);
		}
	}
}
