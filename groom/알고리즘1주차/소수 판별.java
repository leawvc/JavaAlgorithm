import java.io.*;
import java.lang.reflect.Parameter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] num = br.readLine().split(" ");
        int result = 0;
        for (int i = 0; i < n; i++){
            if (Integer.parseInt(num[i]) < 0){
                for (int j = 2; j <= Math.abs(Math.sqrt(Integer.parseInt(num[i]))); j++){
                    if (Integer.parseInt(num[i]) == -2) {
                        result = result - 2;
                    }
                    else if (Integer.parseInt(num[i]) % j != 0){
                        result = result - Integer.parseInt(num[i]);
                    }
                }
            }
            else {
                for (int j = 2; j <= Math.abs(Math.sqrt(Integer.parseInt(num[i]))); j++){
                    if (Integer.parseInt(num[i]) == 2) {
                        result = result + 2;
                    }
                    else if (Integer.parseInt(num[i]) % j != 0){
                        result = result + Integer.parseInt(num[i]);
                    }
                }
            }
        }
        System.out.println(result);
    }
}
