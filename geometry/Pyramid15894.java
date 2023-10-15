import java.io.*;
public class Pyramid15894 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long a = 0;

        for(int i = 1; i <= n; i++) {
            if(i == 1) {
                a = 4;
                continue;
            }
            a = a + 4;
        }

        bw.write(String.valueOf(a));
        bw.flush();
        bw.close();
    }
}
