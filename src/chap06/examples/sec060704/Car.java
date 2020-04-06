package chap06.examples.sec060704;

public class Car {
	// 생성자는 파라미터의 타입의 조합과 순서에 따라 나뉜다.
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {
		System.out.println("에이라는 일을한다.");
	}	

	Car(String model) {
		this(model, "노랑");
//		this.model = model;
		
	}

	Car(String model, String color) {
		this();
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {
		this();
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}








