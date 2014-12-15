public class CarOwner {
	private Car car;

	public CarOwner(Car car) {
		this.car = car;
		
		System.out.println("I've this car=" +car.getModel());
		System.out.println();
	}

	public void moveFromTo (int dist){
		car.start();
		int d = car.drive(dist);
		car.stop();
		
		System.out.println("Я проехал - " +d +"км");
	}
	
}
