import java.io.*;
import java.util.*;
public class Fourth3009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        
        
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            x.add(Integer.parseInt(st.nextToken()));
            y.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> setx = new HashSet<Integer>(x);
        Set<Integer> sety = new HashSet<Integer>(y);
        int x1 = 0, y1 = 0;
        
        for(Integer a: setx) {
            if(Collections.frequency(x, a) == 1) x1 = a;
        }

        for(Integer b: sety) {
            if(Collections.frequency(y, b) == 1) y1 = b;
        }
        
        bw.write(String.format("%d %d", x1, y1));
        bw.flush();
        bw.close();
    }
}
