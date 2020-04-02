package codingbat;

public class WarmUP2 {
	public int arrayCount9(int[] nums) {
		int cnt = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				cnt++;
			}
		}

		return cnt;
	}

	public boolean arrayFront9(int[] nums) {

		int loop = 4;
		if (nums.length < 4) {
			loop = nums.length;
		}

		for (int i = 0; i < loop; i++) {
			if (nums[i] == 9) {
				return true;
			}
		}

		return false;
	}

}
