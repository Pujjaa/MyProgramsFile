package vehicle_temp;

import vehicles.Vehicle;

public class Truck extends Vehicle{
	int maxLoadingCapacity;
	public void print() {
		System.out.println("Truck capacity: "+maxLoadingCapacity);
		System.out.println("Truck color: "+color);
		System.out.println("Truck speed: "+getMaxSpeed());
	}
}
