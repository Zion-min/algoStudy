import java.io.*;
import java.util.*;
public class Remainder3052 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> rmd = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            int tmp = Integer.parseInt(br.readLine()) % 42;
            if(!rmd.contains(tmp)) {
                rmd.add(tmp);
            }
        }

        bw.write(String.valueOf(rmd.size()));
        bw.flush();
        bw.close();

    }
}
