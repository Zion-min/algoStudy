import java.io.*;
public class TimeComplexity24267 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        // 7
        // i: 1 ~ 5
        // j: 2 ~ 6  3 ~ 6  4 ~ 6  5 ~ 6  6 ~ 6
        // k: 3,4,5,6,7 ~ 7   4,5,6,7 ~ 7,  5,6,7 ~ 7   6,7~7   7~7
        // 1 * 5 + 2 * 4 + 3 * 3 + 4 * 2 + 5 * 1
        // 5 + 8 + 9 + 8 + 5 = 10 + 16 + 9
        long sum = 0;
        for(long i = 1; i <= n - 2; i++) {
            sum += i * (n - i - 1);
        }

        bw.write(String.format("%d\n3",sum));
        bw.flush();
        bw.close();



    }
}
