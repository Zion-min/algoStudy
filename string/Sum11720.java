import java.util.*;
import java.io.*;
public class Sum11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        for (int i = 0; i < n; i++) {
            int a = s.charAt(i) - '0';
            sum = sum + a;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }
}
