import java.io.*;
import java.util.StringTokenizer;
public class BigO24313 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        // 조건: n > n0 클것.
        // O(n) 이 궁금하다고 했으므로 g(n) = n
        // fn = a1 * n + a0

        // 일단 최고차항 비교부터..
        if(c - a1 >= 0) {
            for(int n = n0; n <= 10000; n++) {
                if(a1 * n + a0 > c * n) {
                    bw.write("0");
                    break;
                }
                if(n == 10000) {
                    bw.write("1");
                    break;
                }
            }
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();

    }
}
