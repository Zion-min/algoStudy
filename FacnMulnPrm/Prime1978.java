import java.io.*;
import java.util.*;
public class Prime1978 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for(int i = 0; i < N; i++) {
            int t = Integer.parseInt(st.nextToken());
            if(t != 1) {
                for(int j = 2; j <= t; j++) {
                    if(j == t) cnt++;
                    if(t % j == 0) break;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}
