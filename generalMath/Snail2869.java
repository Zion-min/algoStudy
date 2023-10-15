import java.util.*;
import java.io.*;
public class Snail2869 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double v = Double.parseDouble(st.nextToken());



        bw.write(String.valueOf( (int) Math.ceil((v - a) / (a - b)) + 1));
        bw.flush();
        bw.close();

    }
}
