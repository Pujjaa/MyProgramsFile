package vehicles;

public class Car extends Vehicle{
	int numGears;
	boolean isConvertable;

	public void print() {
//		System.out.println("Car color:"+color);
//		System.out.println("Car speed:"+getMaxSpeed());
		//instead this
		super.print();
		System.out.println("Car numGears:"+numGears);
		System.out.println("Car isConvertable:"+isConvertable);
	}
}
