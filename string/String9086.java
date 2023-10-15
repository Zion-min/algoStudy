import java.io.*;
import java.util.*;

public class String9086 {
    public static void main(String[] args) throws IOException{
        int t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            s = br.readLine();
            bw.write(s.charAt(0));
            bw.write(s.charAt(s.length() - 1));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
