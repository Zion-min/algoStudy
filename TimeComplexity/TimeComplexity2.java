import java.io.*;
public class TimeComplexity2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.format("%d\n1", n));
        bw.flush();
        bw.close();

    }
}
