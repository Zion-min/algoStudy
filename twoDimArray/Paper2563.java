import java.util.*;
import java.io.*;
public class Paper2563 {
    public static void main(String[] args) throws IOException{
        // 하나도 안 겹치는 경우
        // 두개가 겹치는 경우
        // 세개가 겹치는 경우.... 몇번 빼주냐의 차이.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[100][100];
        int cnt = 0;

        // x 3 13 y 7 17
        // x 5 15 y 2 12
        // x 15 25 y 7 17
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    if(arr[j][k] != 1) {
                        arr[j][k] = 1;
                        cnt++;
                    }
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
