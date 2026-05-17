import java.util.Scanner;
public class bvslvvr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bvslvvriin urt oloh!");
        System.out.print("Geriin Radius = ");
        double R = input.nextDouble();
        double bvslvvr = 2 * Math.PI * R;
        System.out.println("Bvslvvriin urt = " + bvslvvr + " metr");
    }
}