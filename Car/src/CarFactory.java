
public class CarFactory {

	private static String models[] = {"Audi", "Bentley", "Chevrolet"};
	
	public static void main(String[] args) {
		Car reno = new Car("Reno");
		
			
		System.out.println(reno.getModel());
		reno.start();
		reno.stop();
		
		int dist = reno.drive(1000);
		System.out.println("Километраж " +dist + "км");
	
		CarOwner owner = new CarOwner(reno);
		owner.moveFromTo(1000);
		
		for (int i = 0; i < models.length; i++) {
			Car car = new Car(models[i]);
			System.out.println(car.getModel());
			
		}
	
		
		
	}

}
