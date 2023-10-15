import java.io.*;
public class Triangle10101 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if(a + b + c == 180) {
            if(a == b && b == c) {
                bw.write("Equilateral");
            } else if(a == b || b == c || a == c) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
        } else {
            bw.write("Error");
        }

        bw.flush();
        bw.close();

    }
}
