import java.io.*;
import java.util.*;
public class Print11718 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = "";

        while((s = br.readLine()) != null) {
            bw.write(s);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
