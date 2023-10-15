import java.io.*;
import java.util.*;
public class Pel10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int t = 0;

        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                t += 1;
            } 
        }

        if(t == s.length() / 2) {
            bw.write('1');
        } else {
            bw.write('0');
        }

        bw.flush();
        bw.close();
    }
}
