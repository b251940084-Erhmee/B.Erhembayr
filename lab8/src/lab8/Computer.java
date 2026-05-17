package lab8;

public class Computer {
	private Processor processor;

	private Memory memory;

	private DisplayCard displaycard;

	private SoundCard soundcard;

	public Computer () {

	processor = new Processor ("Intel", "i9-14400", "");

	memory = new Memory ("SK HYNIX", "DDR6", 16);

	displaycard = new DisplayCard ("Nvidia", "RTX4080");

	soundcard = new SoundCard ("Creative Labs", "BlasterX G6");

	}

	public void showInfo() {

	System.out.println("---Computer Medeelel---");

	processor.printInfo();

	memory.printInfo();

	displaycard.printInfo();

	soundcard.printInfo();

	}



	}

