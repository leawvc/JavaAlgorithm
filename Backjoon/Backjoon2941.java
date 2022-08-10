import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for (String s : arr) {
            if (str.contains(s)) {
                str = str.replace(s,"!");
            }
        }
        System.out.println(str.length());
        br.close();
    }
}