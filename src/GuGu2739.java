import java.util.Scanner;
public class GuGu2739 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
           System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
