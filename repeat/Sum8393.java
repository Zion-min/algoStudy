import java.util.Scanner;
// 10^ 10 넘어가면 long 쓰기
public class Sum8393 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        System.out.print(n * (1 + n) / 2);
    }
}
