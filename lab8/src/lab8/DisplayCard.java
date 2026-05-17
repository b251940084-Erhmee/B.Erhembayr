package lab8;

public class DisplayCard {
	private String brand;

	private String type;

	public DisplayCard(String brand, String type) {

	this.brand = brand ;

	this.type = type;

	}

	public void printInfo() {

	System.out.println("GPU:" + brand + ", " + type + ",");

	}



	}

