import java.util.*;
import java.io.*;

public class Constant2908 {
    public static void main(String[] args) throws IOException{
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder sb = new StringBuilder(a);
        a = sb.reverse().toString();

        sb = new StringBuilder(b);
        b = sb.reverse().toString();

        if(Integer.parseInt(a) >= Integer.parseInt(b)) {
            bw.write(a);

        } else {
            bw.write(b);
        }

        bw.flush();
        bw.close();

    }
}
