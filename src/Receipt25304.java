import java.util.Scanner;
import java.util.ArrayList;
public class Receipt25304 {
    public static void main(String[] args) {
        int total, type, a, b;
        int receipt = 0;
        //ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        total = sc.nextInt();
        type = sc.nextInt();

        for (int i = 0; i < type; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            receipt += a * b;
        }

        if (receipt == total) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }


    }

}
