import java.util.Scanner;
public class TestScore9498 {
    public static void main(String[] args) {
        int num1;
        char score;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        if (num1 >= 90) {
            score = 'A';
        } else if (num1 >= 80) {
            score = 'B';
        } else if (num1 >= 70) {
            score = 'C';
        } else if (num1 >= 60) {
            score = 'D';
        } else {
            score = 'F';
        }

        System.out.print(score);

    }
}
