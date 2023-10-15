import java.util.*;
import java.io.*;
public class countLen2743 {
    public static void main(String[] args) throws IOException{
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        s = br.readLine();
        bw.write(String.valueOf(s.length()));
        bw.flush();
        bw.close();

    }
}
