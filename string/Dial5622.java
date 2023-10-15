import java.util.*;
import java.io.*;
public class Dial5622 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'A';
            cnt += 2;
            // 8 + 2, 1 + 2
            //System.out.println(tmp);
            if(tmp >= 0 && tmp <= 2) {
                cnt = cnt + 1;
            } else if(tmp >= 3 && tmp <= 5) {
                cnt = cnt + 2;
            } else if(tmp >= 6 && tmp <= 8) {
                cnt = cnt + 3;
            } else if(tmp >= 9 && tmp <= 11) {
                cnt = cnt + 4;
            } else if(tmp >= 12 && tmp <= 14) {
                cnt = cnt + 5;
            } else if(tmp >= 15 && tmp <= 18) {
                cnt = cnt + 6;
            } else if(tmp >= 19 && tmp <= 21) {
                cnt = cnt + 7;
            } else {
                cnt = cnt + 8;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}
