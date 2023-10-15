import java.util.*;
import java.io.*;
public class Max2566 {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[9][9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max, N, M;
        max = 0;
        N = M = 1;

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp > max) {
                    max = tmp;
                    N = i + 1;
                    M = j + 1;
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(N));
        bw.write(' ');
        bw.write(String.valueOf(M));
        bw.flush();
        bw.close();

    }
}
