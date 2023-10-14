import java.util.Scanner;
public class CodingIs25314 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        // long int = 4
        // 4보다 크면 long long int
        // 8보다 크면 long long long int
        for(int i = 0; i < (n/4); i++) {
            System.out.print("long ");
        }

        if(n % 4 != 0) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}
