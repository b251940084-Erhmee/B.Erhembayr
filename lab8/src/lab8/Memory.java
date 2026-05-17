package lab8;

public class Memory {
	private String brand;

	private String type;

	private int size;

	public Memory(String brand, String type, int size) {

	this.brand = brand;

	this.type = type;

	this.size = size;

	}

	public void printInfo() {

	System.out.println("Ram:" + brand + ", " + type + ", " + size + ",");

	}



	}



