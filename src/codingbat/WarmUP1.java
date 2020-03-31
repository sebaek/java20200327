package codingbat;

public class WarmUP1 {
	public boolean sleepIn(boolean weekday, boolean vacation) {

		return !weekday || vacation;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;
	}

	public int sumDouble(int a, int b) {
		int r = a + b;
		r = (a == b) ? r * 2 : r;
		return r;
	}

	public int diff21(int n) {
		int r = 21 - n;
		r = (r < 0) ? -r : r;
		r = (n > 21) ? r * 2 : r;

		return r;
	}

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && (hour < 7 || hour > 20);
	}

}
