import java.util.*;
import java.io.*;

public class MinMax10818 {
    public static void main(String[] args) throws IOException {
        int N, min, max, tmp;
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        min = max = tmp = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N - 1; i++) {
            tmp = Integer.parseInt(st.nextToken());
            if (tmp < min) min = tmp;
            if (tmp > max) max = tmp;
        }

        bw.write(String.valueOf(min));
        bw.write(" ");
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();


    }
}
