import java.util.Scanner;
public class Quadrant14681 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        // ++ => 1, +- => 4, -+ => 2, -- => 3
        if (x > 0) {
            if (y > 0) {
                System.out.print(1);
            } else {
                System.out.print(4);
            }
        } else {
            if (y > 0) {
                System.out.print(2);
            } else {
                System.out.print(3);
            }
        }
    }
}
