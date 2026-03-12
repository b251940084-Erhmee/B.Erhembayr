import java.util.Scanner;
public class TooniiDundaj {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Toonuudiin Dundaj Oloh!");
		System.out.println("1-r too = ");
		double a = input.nextDouble();
		System.out.println("2-r too = ");
		double b = input.nextDouble();
		double arithmetic = (a + b) / 2;
		double geometric = Math.sqrt(a * b);
		System.out.println("Arifmetic dundaj = " + arithmetic);
		System.out.println("geometr dundaj = " + geometric);
	}
}