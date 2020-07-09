package solutions.reformit.blog.builderpattern;

public interface CarBuilder {

	void buildTransmission();
	void buildSuspension();
	void buildExterior();
	void buildInterior();
	void buildSeatCount();
	void buildWheelType();
	Car getCar();
}
