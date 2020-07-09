package solutions.reformit.blog.builderpattern;

public class AutomotiveEngineer {
	
	private CarBuilder carBuilder;
	
	public AutomotiveEngineer(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public Car build() {
		this.carBuilder.buildTransmission();
		this.carBuilder.buildSuspension();
		this.carBuilder.buildExterior();
		this.carBuilder.buildInterior();
		this.carBuilder.buildSeatCount();
		this.carBuilder.buildWheelType();
		return this.carBuilder.getCar();
	}

}
