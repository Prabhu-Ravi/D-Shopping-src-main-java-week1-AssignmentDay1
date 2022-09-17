package week1.day1;

public class Car {
	
	//Variables
	byte seatingCapacity = 5;
	short maxSpeed = 180;
	int carPrice = 1200000;
	long ownerMobile = 9080889900L;
	
	float milageKm = 25.56F;
	double distanceCovered = 158259.546;
	
	char fuelType = 'P';
	boolean isPetrolEngine = false;
	
	
	//comments
	// method --> actions/ verification
	//drive car
	
	//access modifier, return type methodName
	public void driveCar() {
		int regNumber = 3274;
		char fuelType = 'D';
		System.out.println(regNumber);
		System.out.println(fuelType);
		System.out.println("Prabhu Drive the Car");
	}
	
	public void applyBrake() {
		System.out.println("carPrice = " + carPrice);
		System.out.println(fuelType);
		System.out.println("Applying the Brake");
		driveCar();
	}
	//special method - main method
	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		
		//Create the Object
		Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBrake();
		
		System.out.println(myCar.carPrice);
		
	}
	
}
