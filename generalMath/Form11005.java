import java.io.*;
import java.util.*;
public class Form11005 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());


        ArrayList<Integer> list = new ArrayList<>();

        int quot = N;

        while (quot >= B) {
            list.add(quot % B);
            quot = quot / B;
        }

        list.add(quot);

        for(int i = 0; i < list.size(); i++) {
            int tmp = list.get(list.size() - 1 - i);
            if(B > 10 && tmp >= 10) {
                bw.write((char) (tmp - 10 + 'A'));
            } else {
                bw.write(String.valueOf(tmp));
            }
        }

        bw.flush();
        bw.close();

    }
}
