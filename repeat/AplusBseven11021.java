import java.util.*;
import java.io.*;

public class AplusBseven11021 {
    public static void main(String[] args) throws IOException {
        int T, A, B;

        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+String.valueOf(i+1)+": ");
            bw.write(String.valueOf(A+B));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
