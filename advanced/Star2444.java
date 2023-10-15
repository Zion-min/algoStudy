import java.io.*;
import java.util.*;
public class Star2444 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            for(int j = N; j > i; j--) {
                bw.write(' ');
            }
            for(int k = 1; k <= 2 * i - 1; k++) {
                bw.write('*');
            }
            bw.newLine();
            //bw.write('*');
            // 4(N-1) , 1(2*1-1)
            // 3(N-2) , 3(2*2-2)
            // 2 , 5
            // 1 , 7
            // 0 , 9
        }

        for(int i = 1; i < N; i++) {
            for(int k = 0; k < i; k++) {
                bw.write(' ');
            }
            for(int j = 2 * N - i - 1; j > i; j--) {
                bw.write('*');
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
