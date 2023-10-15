import java.io.*;
import java.util.*;
public class Factor2501 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                cnt++;
            }
            if(cnt == K) {
                bw.write(String.valueOf(i));
                break;
            }
        }

        if(cnt < K) {
            bw.write('0');
        }

        bw.flush();
        bw.close();

    }
}
