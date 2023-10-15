import java.util.*;
import java.io.*;
public class ChangeBall10813 {
    public static void main(String[] args) throws IOException{
        int N, M, i, j;
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        for(int k = 1; k <= N; k++)
            list.add(k);

        for(int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            int tmp = list.get(i-1);
            list.set(i-1, list.get(j-1));
            list.set(j-1, tmp);
        }

        for(Integer a : list) {
            bw.write(String.valueOf(a));
            bw.write(" ");
        }

        bw.flush();
        bw.close();

    }
}
