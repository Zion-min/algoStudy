import java.util.Scanner;
public class OvenAlarm2525 {
    public static void main(String[] args) {
        int A, B, C, H, M;
        int hour = 0, minute;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        H = C / 60;
        M = C % 60;

        // System.out.printf("%d %d", H, M);

        // 14 30 . 1000(1000 / 60 = 16시간 40분)
        // 14(A) + 16(H) - 24 = 6 시(hours)
        // 30(B) + 40(M) - 60 = 10 분(minute)   + 1시간 추가

        if (B + M < 60) {
            minute = B + M;
            if (A + H < 24) {
                hour = A + H;
            } else {
                hour = A + H - 24;
            }
        } else {
            minute = B + M - 60;
            if (A + H + 1 < 24) {
                hour = A + H + 1;
            } else {
                hour = A + H - 23;
            }
        }


        System.out.printf("%d %d", hour, minute);
    }
}
