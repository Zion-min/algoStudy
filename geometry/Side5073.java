import java.io.*;
import java.util.*;
public class Side5073 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        ArrayList<Integer> list = new ArrayList<>();

        while(!(input = br.readLine()).equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(input);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(c < a + b && b < a + c && a < b + c) {
                if(a == b && b == c) {
                    bw.write("Equilateral\n");
                } else if(a == b || b == c || a == c) {
                    bw.write("Isosceles\n");
                } else {
                    bw.write("Scalene\n");
                }
            } else {
                bw.write("Invalid\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
