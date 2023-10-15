import java.io.*;

public class Clean2720 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        // 1달러 = 100센트
        // 1쿼터 = 0.25달러 = 25센트
        // 1다임 = 10센트
        // 1니켈 = 5센트
        // 1페니 = 1센트

        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            if(C >= 25) { // 쿼터
                bw.write(String.valueOf(C / 25));
                bw.write(' ');
                C = C % 25;
            } else {
                bw.write(String.valueOf(0));
                bw.write(' ');
            }
            if(C >= 10) {
                bw.write(String.valueOf(C / 10));
                bw.write(' ');
                C = C % 10;
            } else {
                bw.write(String.valueOf(0));
                bw.write(' ');
            }
            if(C >= 5) {
                bw.write(String.valueOf(C / 5));
                bw.write(' ');
                C = C % 5;
            } else {
                bw.write(String.valueOf(0));
                bw.write(' ');
            }
            if(C >= 1) {
                bw.write(String.valueOf(C));
                bw.write(' ');
            } else {
                bw.write(String.valueOf(0));
                bw.write(' ');
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
