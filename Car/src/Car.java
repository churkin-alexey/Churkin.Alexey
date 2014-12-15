public class Car {

	private String model;

	public Car(String modelNewCar) {
		model = modelNewCar;
	}
	
	public int drive(int howlong) {
		int d = howlong * 60;
		return d;
	}

	public void start(){
		System.out.println("Машина тронулась");
	}
	
	public void stop() {
		System.out.println("Машина остановилась");
	}

	public String getModel(){
		return model;
	}
	
}
