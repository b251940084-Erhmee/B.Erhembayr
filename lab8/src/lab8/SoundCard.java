package lab8;

public class SoundCard {
	private String brand;

	private String type;

	public SoundCard(String brand, String type) {

	this.brand = brand;

	this.type = type;

	}

	public void printInfo() {

	System.out.println("Sound:" + brand + ", " + type + ",");

	}

	}

