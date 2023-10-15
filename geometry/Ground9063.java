import java.util.*;
import java.io.*;
public class Ground9063 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> xlist = new ArrayList<>();
        ArrayList<Integer> ylist = new ArrayList<>();

        StringTokenizer st;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            xlist.add(Integer.parseInt(st.nextToken()));
            ylist.add(Integer.parseInt(st.nextToken()));
        }

        int width = Collections.max(xlist) - Collections.min(xlist);
        int height = Collections.max(ylist) - Collections.min(ylist);

        bw.write(String.valueOf(width * height));
        bw.flush();
        bw.close();

    }
}
