package myjava;

public class TestAnswers2 {
	// 1:4
	// 2:3
	// 3:4
	// 4:2
	// 5:4
	// 6:3
	// 7:3
	// 8:3
	// 9:4
	// 10:1
	// 11:2
	// 12:1
	// 13:4
	// 14:4
	// 15:3
	// 16:2
	// 17:2
	// 18:3
	
	public static void main(String[] args) {
		// 19:
		int[][] arr1 = new int[][] {{1, 2, 3}, {4, 5}, {6}};
		System.out.println(arr1[1][1]);
		
		// 20:
		int[] arr2 = {-2, 0, 1, 8, 3};
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr2.length; i++) {
			max = Math.max(max, arr2[i]);
		}
		System.out.println(max);
		
	}
}











