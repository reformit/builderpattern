package solutions.reformit.blog.builderpattern;

public class FamilyCarBuilder implements CarBuilder {

	private Car car;
	
	public FamilyCarBuilder() {
		this.car = new Car();
	}
	
	@Override
	public void buildTransmission() {
		car.setTransmission("Automatic");
		System.out.println("FamilyCarBuilder: Tranmission complete...");
	}	
	
	@Override
	public void buildSuspension() {
		car.setSuspension("Road Shocks and Springs");
		System.out.println("FamilyCarBuilder: Suspension complete...");
	}	

	@Override
	public void buildExterior() {
		car.setExterior("Sedan");
		System.out.println("FamilyCarBuilder: Exterior complete...");
	}

	@Override
	public void buildInterior() {
		car.setInterior("Stain Resistent Upholstery");
		System.out.println("FamilyCarBuilder: Interior complete...");
	}
	
	@Override
	public void buildSeatCount() {
		car.setSeatCount(4);
		System.out.println("FamilyCarBuilder: Seat Count complete...");
		
	}

	@Override
	public void buildWheelType() {
		car.setWheelType("Extended Mileage");
		System.out.println("FamilyCarBuilder: Wheel Type complete...");
	}	


	@Override
	public Car getCar() {
		System.out.println("FamilyCarBuilder: Family Car complete...");
		return this.car;
	}
}
