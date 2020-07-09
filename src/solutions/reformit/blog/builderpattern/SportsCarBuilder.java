package solutions.reformit.blog.builderpattern;

public class SportsCarBuilder implements CarBuilder {

	private Car car;
	
	public SportsCarBuilder() {
		this.car = new Car();
	}
	
	@Override
	public void buildTransmission() {
		car.setTransmission("Manual");
		System.out.println("SportsCarBuilder: Tranmission complete...");
	}	
	
	@Override
	public void buildSuspension() {
		car.setSuspension("Racing Shocks, Re-inforced Springs");
		System.out.println("SportsCarBuilder: Suspension complete...");
	}	

	@Override
	public void buildExterior() {
		car.setExterior("Aerodynamic");
		System.out.println("SportsCarBuilder: Exterior complete...");
	}

	@Override
	public void buildInterior() {
		car.setInterior("Leather Seats, Tacomoter");
		System.out.println("SportsCarBuilder: Interior complete...");
	}
	
	@Override
	public void buildSeatCount() {
		car.setSeatCount(2);
		System.out.println("SportsCarBuilder: Seat Count complete...");
		
	}

	@Override
	public void buildWheelType() {
		car.setWheelType("Low Profile, Racing");
		System.out.println("SportsCarBuilder: Wheel Type complete...");
	}	

	@Override
	public Car getCar() {
		System.out.println("SportsCarBuilder: Sports Car complete...");
		return this.car;
	}
}
