import java.io.*;
public class StarOne2438 {
    public static void main(String[] args) throws IOException{
        int N;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i ++) {
            for (int k = 1; k <= N - i; k++)
                bw.write(" ");
            for (int j = 1; j <= i; j ++)
                bw.write("*");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
