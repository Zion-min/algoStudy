import java.io.*;
import java.util.*;

public class FindAl10809 {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> st = new ArrayList<>(
                Collections.nCopies(26, -1)
        );
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'a';
            int idx = st.get(tmp);
            if(idx > i || idx == -1)
                st.set(tmp, i);
        }

        for(Integer a : st) {
            bw.write(String.valueOf(a));
            bw.write(' ');
        }

        bw.flush();
        bw.close();
    }
}
