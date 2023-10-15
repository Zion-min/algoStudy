import java.util.Scanner;
import java.util.ArrayList;
public class CaseAddition10950 {
    public static void main(String[] args) {
        int t, a, b;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            list.add(a);
            list.add(b);
        }

        for(int i = 0; i < t; i++) {
            System.out.printf("%d\n", list.get(i*2)+list.get(i*2+1));
        }
    }

}
