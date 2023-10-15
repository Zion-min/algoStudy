import java.io.*;
import java.util.*;
public class MulnFac5086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        StringTokenizer st;

        while(!(input = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(b % a == 0) {
                bw.write("factor");
                bw.newLine();
            } else if(a % b == 0) {
                bw.write("multiple");
                bw.newLine();
            } else {
                bw.write("neither");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
