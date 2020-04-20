package chap08.examples.sec080505;

public class VehicleExample {
	public static void main(String[] args) {
//		Vehicle vehicle = new Bus();
		Vehicle vehicle = new Taxi();
		
		vehicle.run();
//		vehicle.checkFare();
		
		System.out.println(vehicle instanceof Bus);
		System.out.println(vehicle instanceof Taxi);
		System.out.println(vehicle instanceof Vehicle);
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.run();
			bus.checkFare();
		}
		
	}
}








