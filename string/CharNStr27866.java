import java.util.*;
import java.io.*;
public class CharNStr27866 {
    public static void main(String[] args) throws IOException{
        String s;
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        s = br.readLine();
        bw.write(s.charAt(Integer.parseInt(br.readLine()) - 1));
        bw.flush();
        bw.close();

    }

}
