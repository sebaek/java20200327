package chap08.examples.sec080301;

import chap08.examples.sec080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		
		RemoteControl r1 = new RemoteControl() {
			@Override
			public void turnOn() {
			}

			@Override
			public void turnOff() {
			}

			@Override
			public void setVolume(int volume) {
			}
		};
	}
}














