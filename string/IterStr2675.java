import java.io.*;
import java.util.*;
public class IterStr2675 {
    public static void main(String[] args) throws IOException{
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    bw.write(s.charAt(j));
                }
            }
            bw.newLine();
        }


        bw.flush();
        bw.close();

    }
}
