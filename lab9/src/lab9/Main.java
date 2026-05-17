
	package lab9;

	public class Main {

	    public static void main(String[] args) {

	        clock c = new clock();

	        c.setClock(2026,5,15,10,30,20);

	        System.out.println(
	            c.getLdt().format(c.getFormatter())
	        );
	    }
	}
