import java.util.Scanner;
public class GurwaljinTalbai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gurwaljinii talbai oloh!");
        System.out.print("ax = ");
        double ax = input.nextDouble();
        System.out.print("ay = ");
        double ay = input.nextDouble();
        System.out.print("bx = ");
        double bx = input.nextDouble();
        System.out.print("by = ");
        double by = input.nextDouble();
        System.out.print("cx = ");
        double cx = input.nextDouble();
        System.out.print("cy = ");
        double cy = input.nextDouble();
        double AB = Math.sqrt((bx - ax)*(bx - ax) + (by - ay)*(by - ay));
        double BC = Math.sqrt((cx - bx)*(cx - bx) + (cy - by)*(cy - by));
        double CA = Math.sqrt((ax - cx)*(ax - cx) + (ay - cy)*(ay - cy));
        double p = (AB + BC + CA) / 2;
        double talbai = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
        System.out.println("Gurwaljinii talbai = " + talbai);
    }
}