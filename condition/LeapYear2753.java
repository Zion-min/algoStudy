import java.util.Scanner;
public class LeapYear2753 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}
