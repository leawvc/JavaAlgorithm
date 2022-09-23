import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Backjoon1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(in));
        String num[] = br.readLine().split("-");
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            int j = 0;
            String num1[] = num[i].split("\\+");
            for (int k = 0; k < num1.length; k++){
                j += Integer.getInteger(num1[k]);
            }
            if (i == 0){
                sum+= j;
            }else sum-=j;
        }
        out.println(sum);
    }
}
