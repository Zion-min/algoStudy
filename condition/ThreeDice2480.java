import java.util.Scanner;
public class ThreeDice2480 {
    public static void main(String[] args) {
        int A, B, C;
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if(A == B && A == C) {
            System.out.print(10000+A*1000);
        } else if(A == B || B == C || A == C) {
            if(A == B || A == C) {
                System.out.print(1000+A*100);
            } else if(B == C) {
                System.out.print(1000+B*100);
            }
        } else {
            if(A > B && A > C) {
                System.out.print(A*100);
            } else if(B > A && B > C) {
                System.out.print(B*100);
            } else {
                System.out.print(C*100);
            }
        }
    }
}
