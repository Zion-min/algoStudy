import java.io.*;
import java.util.*;
public class Score25206 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input;

        double png = 0;
        double h = 0;

        while((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            st.nextToken();
            double hak = Double.parseDouble(st.nextToken());
            String dng = st.nextToken();
            switch (dng) {
                case "A+":
                    png += hak * 4.5;
                    h += hak;
                    break;
                case "A0":
                    png += hak * 4.0;
                    h += hak;
                    break;
                case "B+":
                    png += hak * 3.5;
                    h += hak;
                    break;
                case "B0":
                    png += hak * 3.0;
                    h += hak;
                    break;
                case "C+":
                    png += hak * 2.5;
                    h += hak;
                    break;
                case "C0":
                    png += hak * 2.0;
                    h += hak;
                    break;
                case "D+":
                    png += hak * 1.5;
                    h += hak;
                    break;
                case "D0":
                    png += hak;
                    h += hak;
                    break;
                case "F":
                    png += hak * 0.0;
                    h += hak;
                    break;
            }
        }

        bw.write(String.valueOf(png/h));
        bw.flush();
        bw.close();
    }

}

