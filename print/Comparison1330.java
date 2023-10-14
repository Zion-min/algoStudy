import java.util.Scanner;
public class Comparison1330 {
    public static void main(String[] args) {
        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.print(">");
        } else if (num1 == num2) {
            System.out.print("==");
        } else {
            System.out.print("<");
        }
    }
}
