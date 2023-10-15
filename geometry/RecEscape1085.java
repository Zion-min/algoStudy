import java.util.*;
import java.io.*;
public class RecEscape1085 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] list = {(w-x), (h-y), x, y};

        int min = Arrays.stream(list).min().getAsInt();

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
