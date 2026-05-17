package lab7;

public class Student {
	private String ner;
	private int nas;
	private String oyutniiicode;
	public String getNer() {
		return ner;
	}
	public void setNer(String ner) {
		this.ner = ner;
	}
	public int getNas() {
		return nas;
	}
	public void setNas(int nas) {
		this.nas = nas;
	}
	public String getOyutniiicode() {
		return oyutniiicode;
	}
	public void setOyutniiicode(String oyutniiicode) {
		this.oyutniiicode = oyutniiicode;
	}
	public Student(String ner, int nas, String oyutniiicode) {
		super();
		this.ner = ner;
		this.nas = nas;
		this.oyutniiicode = oyutniiicode;
	}
	
}

