package solutions.reformit.blog.builderpattern;

import org.junit.jupiter.api.Test;

class AutomotiveEngineerTest {

	@Test
	void test() {
		CarBuilder sportsCarBuilder = new SportsCarBuilder();
		AutomotiveEngineer sportsCarEngineer = new AutomotiveEngineer(sportsCarBuilder);
		Car sportsCar = sportsCarEngineer.build();
		System.out.println("[Sports Car] " + sportsCar);
		System.out.println();
		
		CarBuilder familyCarBuilder = new FamilyCarBuilder();
		AutomotiveEngineer familyCarEngineer = new AutomotiveEngineer(familyCarBuilder);
		Car famlyCar = familyCarEngineer.build();
		System.out.println("[Family Car] " + famlyCar);
		System.out.println();
	}

}
