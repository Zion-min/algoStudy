import java.io.*;
public class Fraction1193 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int chk = 0;

        for(int i = 0; i < 3 * x; i += chk) {
            chk++;
            if(x <= i + chk) {
                for(int j = 0; j <= chk; j++) {
                    if(x == i + j + 1) {
                        if(chk % 2 == 0) {
                            bw.write(String.valueOf(j + 1));
                            bw.write('/');
                            bw.write(String.valueOf(chk - j));
                            break;
                        } else {
                            bw.write(String.valueOf(chk - j));
                            bw.write('/');
                            bw.write(String.valueOf(j + 1));
                            break;
                        }
                    }
                }
                break;
            }
        }

        bw.flush();
        bw.close();


    }
}
