package lab9;

	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;

	public class clock {
	  private int year;
	  private int month;
	  private int day;
	  private int time;
	  private int minute;
	  private int second;
	  private LocalDateTime ldt;
	  private DateTimeFormatter formatter;
	  public clock() {
	    setFormatter(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	  }
	  public void setClock(int y, int mon, int d, int t, int min, int s) {
		  this.year = y ;
		  this.month = mon;
		  this.day = d;
		  this.time = t;
		  this.minute = min;
		  this.second = s;
		  this.setLdt(LocalDateTime.of(year, month, day, time, minute, second));
	    
	  }
	  public void autoSetClock() {
	    
	  }
	  public void tickClock() {
	    
	  }
	  public void tickClock(int tick) {
	    
	  }
	  public LocalDateTime getLdt() {
		return ldt;
	  }
	  public void setLdt(LocalDateTime ldt) {
		this.ldt = ldt;
	  }
	  public DateTimeFormatter getFormatter() {
		return formatter;
	  }
	  public void setFormatter(DateTimeFormatter formatter) {
		this.formatter = formatter;
	  }
	}

