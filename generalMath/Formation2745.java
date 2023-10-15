import java.io.*;
import java.util.*;

public class Formation2745 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int ten = 0;

        // 자릿수.
        for(int i = 0; i < N.length(); i++) {
            if(N.charAt(N.length() - 1 - i) - 'A' < 0) {
                ten += (N.charAt(N.length() - 1 - i) - '0') *  Math.pow(B, i);
            } else {
                ten += (N.charAt(N.length() - 1 - i) - 'A' + 10) *  Math.pow(B, i);
            }
        }

        bw.write(String.valueOf(ten));
        bw.flush();
        bw.close();

    }
}
