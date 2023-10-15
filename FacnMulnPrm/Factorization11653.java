import java.util.*;
import java.io.*;
public class Factorization11653 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int quot = N;


        for(int j = 2; j <= N; j++) {
            if(quot % j == 0) {
                bw.write(String.format("%d\n",j));
                quot /= j;
                j = 1;
            }
            if(j == quot) break;
        }


        bw.flush();
        bw.close();

    }
}
