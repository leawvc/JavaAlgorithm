import java.io.*;
import java.lang.reflect.Parameter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] word = br.readLine().split(" ");
        int a = 1;
        for (int i = 0; i < n; i++){
            a = a * (Integer.parseInt(word[i]));
        }
        System.out.print(a);
    }
}
