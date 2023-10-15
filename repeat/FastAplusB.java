import java.io.*;
import java.util.StringTokenizer;

public class FastAplusB {
    public static void main(String[] args) throws IOException {
        int t, a, b;
        StringTokenizer st;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            bw.write(String.valueOf(a+b));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
