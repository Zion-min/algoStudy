import java.util.*;
import java.io.*;
public class ReverseBas10811 {
    public static void main(String[] args) throws IOException{
        int N, M, i, j;
        StringTokenizer st;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int k = 1; k <= N; k++) {
            list.add(k);
        }

        // 1(i+0), 4(j+0)   2(i+1), 3(j-1)
        // 1, 6   2, 5    3(i+2), 4  => 총 몇개? 6(6-1+1)/2 = 3번 반복
        // 1(i), 3(j)   2(안바꿔도 됨) => 3/2 1번 반복
        for(int k = 0; k < M; k++) {
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            for(int q = 0; q < (j - i + 1) / 2; q++) {
                int tmp = list.get(i-1+q);
                // 이거 실수.. list.get 해서 바까줘야함.
                list.set(i-1+q, list.get(j-1-q));
                list.set(j-1-q, tmp);
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
