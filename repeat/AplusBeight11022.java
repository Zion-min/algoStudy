import java.util.*;
import java.io.*;

public class AplusBeight11022 {
    public static void main(String[] args) throws IOException {
        int X, A, B;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        X = Integer.parseInt(br.readLine());

        for (int i = 0; i < X; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write("Case #"+String.valueOf(i+1)+": ");
            bw.write(String.valueOf(A) + " + " + String.valueOf(B) + " = " + String.valueOf(A+B));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
