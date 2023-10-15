import java.io.*;
public class BeeHouse2292 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int chk = 0;
        int tmp = 1;

        for(int i = 0; i < n; i++) {
            tmp += 3 * (2 * i);
            if(n > tmp) {
                chk++;
            }
            if(n < tmp + 3 * (2 * (i+1))) {
                chk++;
                break;
            }
        }

        bw.write(String.valueOf(chk));
        bw.flush();
        bw.close();

    }
}
