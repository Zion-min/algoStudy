import java.util.*;
import java.io.*;
public class AssignmentWho5597 {
    public static void main(String[] args) throws IOException{
        int n;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Boolean> list = new ArrayList<>(
                Collections.nCopies(30, false)
        );

        for(int i = 0; i < 28; i++) {
            n = Integer.parseInt(br.readLine());
            list.set(n-1, true);
        }

        for(int i = 0; i < 30; i++) {
            if(!list.get(i)) {
                bw.write(String.valueOf(i+1));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
