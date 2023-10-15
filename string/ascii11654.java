import java.util.*;
import java.io.*;
public class ascii11654 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        bw.write(String.valueOf(a.charAt(0) - 0));
        bw.flush();
        bw.close();

    }
}
