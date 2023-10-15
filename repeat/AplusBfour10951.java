import javax.imageio.IIOException;
import java.util.*;
import java.io.*;
public class AplusBfour10951 {
    public static void main(String[] args) throws IOException {
        int A, B;
        String input;
        StringTokenizer st;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(A+B));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
