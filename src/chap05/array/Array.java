package chap05.array;

public class Array {
	public static void main(String[] args) {
		int age1;
		int age2;
		int age3;
		;;;
		
		int age100;
		
		// 배열
		int[] ageArray;
//		int ageArray5[];
		
		ageArray = new int[100];
		
		// 배열의 초기값 page.156
		System.out.println(ageArray[88]);
		
		// 배열의 초기값 할당
		int[] ageArray2;
		ageArray2 = new int[] {3, 4, 1, 0, -1, 5, 22};
		System.out.println(ageArray2[0]);
		System.out.println(ageArray2[6]);
		
		// 배열의 선언과 동시에 할당 
		int[] ageArray3 = {9, 10, 11, -9, 33};
		System.out.println(ageArray3[0]);
		System.out.println(ageArray3[4]);
		
		// 배열의 인덱스 0~길이-1
		
		// 배열의 길이
		System.out.println(ageArray.length);
		System.out.println(ageArray2.length);
		System.out.println(ageArray3.length);
		
		// ArrayIndexOutofBoundsException
//		System.out.println(ageArray[100]);
		
		// 배열과 for
		for (int i = 0; i < ageArray3.length; i++) {
			System.out.println(ageArray3[i]);
		}
		
		// 배열의 값 변경
		ageArray3[3] = 9999999;
		System.out.println(ageArray3[3]);
		
		// 향상된 for 문
		for (int value : ageArray3) {
			System.out.println(value);
		}
		
		
		
	}
}



















