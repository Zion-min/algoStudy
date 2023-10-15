import java.io.*;

public class Factor2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;

        for(int i = M; i <= N; i++) {
            if(i != 1) {
                for(int j = 2; j <= i; j++) {
                    if(j == i) {
                        sum += i;
                        if(min > i) min = i;
                    }
                    if(i % j == 0) {
                        break;
                    }
                }
            }
        }

        if(sum == 0) {
            bw.write("-1");
        } else {
            bw.write(String.format("%d\n%d",sum,min));
        }

        bw.flush();
        bw.close();
    }
}
