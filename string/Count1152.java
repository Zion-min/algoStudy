import java.util.*;
import java.io.*;
public class Count1152 {
    public static void main(String[] args) throws IOException{
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        bw.write(String.valueOf(st.countTokens()));
        bw.flush();
        bw.close();
    }
}
