package lab8;

public class Processor {
	private String brand;

	private String cores;

	private String cache;



	public Processor(String brand, String cores, String cache) {

	this.brand = brand;

	this.cores = cores;

	this.setCache(cache);

	}

	public void printInfo() {

	System.out.println("Cpu:" + brand + ", " + cores + " cores ");

	}

	public String getCache() {
		return cache;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}

	}
