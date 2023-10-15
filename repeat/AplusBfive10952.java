import java.io.*;
import java.util.*;

public class AplusBfive10952 {
    public static void main(String[] args) throws IOException{
        int A, B;
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            if (A == 0 & B == 0) break;

            bw.write(String.valueOf(A+B));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
