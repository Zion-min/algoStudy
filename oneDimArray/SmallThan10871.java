import java.util.*;
import java.io.*;

public class SmallThan10871 {
    public static void main(String[] args) throws IOException{
        int n, x, comp;
        StringTokenizer st;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            comp = Integer.parseInt(st.nextToken());
            if(comp < x) {
                bw.write(String.valueOf(comp));
                bw.write(" ");
            }
        }

        bw.flush();
        bw.close();

    }
}
