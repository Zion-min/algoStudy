import java.util.*;
import java.io.*;

public class Max2562 {
    public static void main(String[] args) throws IOException{
        int max, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        max = Integer.parseInt(br.readLine());
        n = 1;
        for(int i = 2; i <= 9; i++) {
            int tmp = Integer.parseInt(br.readLine());
            if (tmp > max) {
                max = tmp;
                n = i;
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(n));
        bw.flush();
        bw.close();
    }
}
