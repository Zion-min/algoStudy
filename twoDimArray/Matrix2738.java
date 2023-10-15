import java.io.*;
import java.util.*;
public class Matrix2738 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int [][] arr1 = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int ele = Integer.parseInt(st.nextToken());
                arr1[i][j] = ele;
            }
        }

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                int ele = Integer.parseInt(st.nextToken());
                bw.write(String.valueOf(arr1[i][j] + ele));
                bw.write(' ');
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
