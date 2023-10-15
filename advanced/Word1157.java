import java.util.*;
import java.io.*;
public class Word1157 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>(
                Collections.nCopies(26, 0)
        );
        String s = br.readLine().toUpperCase();

        for(int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'A';
            list.set(tmp, list.get(tmp) + 1);
        }

        int max = 0;
        int cnt = -1;
        int index = 0;

        for(int i = 0; i < 26; i++) {
            if(list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }



        for(Integer a: list) {
            if(a == max) cnt++;
        }

        //System.out.println(cnt);

        if(cnt <= 0) {
            bw.write(String.valueOf((char) (index + 'A')));
        } else {
            bw.write('?');
        }


        bw.flush();
        bw.close();

    }
}
