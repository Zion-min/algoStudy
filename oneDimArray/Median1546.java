import java.util.*;
import java.io.*;
public class Median1546 {
    public static void main(String[] args) throws IOException{
        int N, M;
        StringTokenizer st;
        ListIterator<Integer> iter;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>(N);

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        list.add(M);

        for(int i = 0; i < N-1; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            list.add(tmp);
            if (tmp > M) M = tmp;
        }

        iter = list.listIterator();

        double median = 0;

        while(iter.hasNext()) {
            int n = iter.next();
            median += (double) n / M * 100;
        }

        median /= N;

        bw.write(String.valueOf(median));
        bw.flush();
        bw.close();
    }
}
