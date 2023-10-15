import java.util.*;
import java.io.*;

public class Counting10807 {
    public static void main(String[] args) throws IOException{
        int N, v, count = 0;
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(br.readLine());

        for(int i  = 0; i < N; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        for (Integer integer : list) {
            if (integer == v) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
