import java.util.Scanner;
public class Multiple2588 {
    public static void main(String[] args) {
        int n1;
        int ch1, ch2, ch3;
        String n2, buffer;

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();

        buffer = sc.nextLine();
        n2 = sc.nextLine();
        ch1 = n2.charAt(0) - '0';
        ch2 = n2.charAt(1) - '0';
        ch3 = n2.charAt(2) - '0';

        // 3, 4, 5번 출력 ch3
        System.out.println(n1 * ch3);
        System.out.println(n1 * ch2);
        System.out.println(n1 * ch1);
        // 6번 출력
        System.out.print(n1 * Integer.parseInt(n2));


    }
}
