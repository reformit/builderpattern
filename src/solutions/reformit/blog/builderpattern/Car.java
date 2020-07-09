package solutions.reformit.blog.builderpattern;

public class Car {
	
	private String transmission;
	private String suspension;	
	private String exterior;
	private String interior;
	private Integer seatCount;
	private String wheelType;
	
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}	
	public void setExterior(String exterior) {
		this.exterior = exterior;
	}
	public void setInterior(String interior) {
		this.interior = interior;
	}
	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}
	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}	
	
	public String toString() {
        return "Tranmission = {" + transmission + 
        		"} \n Suspension = {" + suspension + 
        		"} \n Exterior = {" + exterior + 
        		"} \n Interior = {" + interior + 
        		"} \n Seat Count = {" + seatCount.toString() + 
        		"} \n Wheel Type = {" + wheelType + "}";
	}
}
