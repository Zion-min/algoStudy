import java.io.*;
public class TimeComplexity24264 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());


        bw.write(String.format("%d\n2",n*n));

        bw.flush();
        bw.close();
    }
}
