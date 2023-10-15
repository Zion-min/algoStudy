import java.io.*;
public class Center2903 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int dot = 2;

        for(int i = 0; i < n; i++) {
            dot += (dot - 1);
        }

        bw.write(String.valueOf(dot * dot));
        bw.flush();
        bw.close();
    }
}
