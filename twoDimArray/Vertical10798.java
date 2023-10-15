import java.io.*;
import java.util.*;
public class Vertical10798 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int maxlen = 0;
        char[][] arr = new char[5][15];

        for(int i = 0; i < 5; i++) {
            String s = br.readLine();
            if(maxlen < s.length()) {
                maxlen = s.length();
            }
            arr[i] = new char[s.length()];
            for(int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for(int i = 0; i < 5; i++) {
            arr[i] = Arrays.copyOf(arr[i], maxlen);
        }

        // 0,0  1,0  2,0  3,0  ... 4,0
        for(int i = 0; i < maxlen; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[j][i] != 0)
                    bw.write(arr[j][i]);
            }
        }

        bw.flush();
        bw.close();

    }
}
