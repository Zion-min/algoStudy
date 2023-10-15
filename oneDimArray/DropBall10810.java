import java.util.*;
import java.io.*;
public class DropBall10810 {
    public static void main(String[] args) throws IOException{
        int N, M, i, j, k;
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>(
                Collections.nCopies(N, 0)
        );

        for(int r = 0; r < M; r++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            for(int q = i-1; q <= j-1; q++) {
                list.set(q, k);
            }
        }

        for(Integer a : list) {
            bw.write(String.valueOf(a));
            bw.write(" ");
        }

        bw.flush();
        bw.close();

    }
}
