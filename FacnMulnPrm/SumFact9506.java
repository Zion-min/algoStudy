import java.io.*;
public class SumFact9506 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while(!(input = br.readLine()).equals("-1")) {
            int n = Integer.parseInt(input);
            int tmp = 0;
            StringBuilder result = new StringBuilder(String.format("%d =",n));

            for(int i = 1; i < n; i++) {
                if(n % i == 0) {
                    tmp += i;
                    result.append(String.format(" %d +", i));
                }
            }

            if(tmp != n) {
                bw.write(String.format("%d is NOT perfect.\n", n));
            } else {
                bw.write(String.valueOf(result.deleteCharAt(result.length()-1)));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();

    }
}
