import java.util.*;
import java.io.*;
public class King3003 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String king = String.valueOf(1 - Integer.parseInt(st.nextToken()));
        String queen = String.valueOf(1 - Integer.parseInt(st.nextToken()));
        String look = String.valueOf(2 - Integer.parseInt(st.nextToken()));
        String shop = String.valueOf(2 - Integer.parseInt(st.nextToken()));
        String night = String.valueOf(2 - Integer.parseInt(st.nextToken()));
        String pone = String.valueOf(8 - Integer.parseInt(st.nextToken()));

        bw.write(king);
        bw.write(' ');
        bw.write(queen);
        bw.write(' ');
        bw.write(look);
        bw.write(' ');
        bw.write(shop);
        bw.write(' ');
        bw.write(night);
        bw.write(' ');
        bw.write(pone);
        bw.write(' ');


        bw.flush();
        bw.close();

    }
}
