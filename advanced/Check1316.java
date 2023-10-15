import java.io.*;
import java.util.*;
public class Check1316 {
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        ArrayList<Integer> index = new ArrayList<>(
                Collections.nCopies(26, -1)
        );

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++) {
                int tmp = index.get(s.charAt(j) - 'a');
                if(tmp == -1 || j - tmp == 1) { // 해당 단어의 마지막 인덱스가 아무것도 없으면
                    // cc 같이 바로 옆에 붙어있는 단어의 경우
                    index.set(s.charAt(j) - 'a', j); // 인덱스를 넣어준다.
                } else if(j - tmp > 1){ // baab같이 떨어져있으면
                    break;
                }
                if(j == s.length() - 1) { // 반복문 잘 돌고 멈추지도 않았으면
                    cnt++;
                }
            }
            index = new ArrayList<>(
                    Collections.nCopies(26, -1)
            );
        }


        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}
