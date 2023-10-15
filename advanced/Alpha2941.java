
import java.io.*;

public class Alpha2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int cnt = 0;

        for(int i = 0; i < s.length(); i++) {
            if(i < s.length() - 2) {
                String sub = s.substring(i, i+2);
                String sub2 = s.substring(i, i+3);
                if(sub.equals("c=") || sub.equals("c-") || sub.equals("d-") || sub.equals("lj") ||
                        sub.equals("nj") || sub.equals("s=") || sub.equals("z=")) {
                    cnt++;
                    i+=1;

                } else if(sub2.equals("dz=")) {
                    cnt++;
                    i+=2;
                } else {
                    cnt++;
                }
            } else if(i < s.length() - 1) { //  == s.length() - 2
                String sub = s.substring(i, i+2);
                if(sub.equals("c=") || sub.equals("c-") || sub.equals("d-") || sub.equals("lj") ||
                        sub.equals("nj") || sub.equals("s=") || sub.equals("z=")) {
                    cnt++;
                    i+=1;

                } else {
                    cnt++;
                }
            } else { //  == s.length() - 1
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}
