import java.util.Scanner;
public class Alarm2884 {
    public static void main(String[] args) {
        int H, M;
        Scanner sc = new Scanner(System.in);

        H = sc.nextInt();
        M = sc.nextInt();

        // 0 0 에서 45분 빼면? 60 - (45 - 0) = 15분 , 24 - 1 = 11시
        // 0 44 에서 빼면? 60 - (45 - 44) = 59분, 24 - 1 = 11시
        if (M - 45 >= 0) {
            M = M - 45;
        } else {
            M = 60 - 45 + M;
            if (H - 1 >= 0) {
                H = H - 1;
            } else {
                H = 23;
            }
        }

        System.out.printf("%d %d",H, M);
    }
}
