import java.io.*;
public class TimeComplexity24265 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        // 1 ~ 6
        // 2 ~ 7, 3 ~ 7, 4 ~ 7, 5 ~ 7, 6 ~ 7, 7 ~ 7
        // 6  5  4  3  2  1 = 21번
        // n(n-1)/2
        bw.write(String.format("%d\n2",n*(n-1)/2));
        bw.flush();
        bw.close();
    }
}
