import java.io.*;
import java.util.*;
public class ThreeStick14215 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a >= b + c) {
            a = b + c - 1;
        }

        if(b >= c + a) {
            b = c + a - 1;
        }

        if(c >= a + b) {
            c = a + b - 1;
        }

        bw.write(String.valueOf(a + b + c));
        bw.flush();
        bw.close();

    }
}
