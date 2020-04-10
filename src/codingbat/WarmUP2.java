package codingbat;

public class WarmUP2 {
	public String stringTimes(String str, int n) {
		String r = "";

		for (int i = 0; i < n; i++) {
			r += str;
		}

		return r;
	}

	public String frontTimes(String str, int n) {
		String r = "";
		String sub = null;

		if (str.length() > 3) {
			sub = str.substring(0, 3);
		} else {
			sub = str;
		}

		for (int i = 0; i < n; i++) {
			r += sub;
		}

		return r;
	}

	int countXX(String str) {
		int cnt = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				cnt++;
			}
		}
		return cnt;
	}

	boolean doubleX(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				if (str.charAt(i + 1) == 'x') {
					return true;
				} else {
					break;
				}
			}
		}
		return false;
	}

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

	public boolean array123(int[] nums) {

		for (int i = 2; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i - 1] == 2
					&& nums[i - 2] == 1) {
				return true;
			}
		}
		return false;
	}

}
