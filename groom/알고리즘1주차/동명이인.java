import java.io.*;
import java.lang.reflect.Parameter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        String [] name = new String[input[0].charAt(0) - '0'];
        for(int i = 0; i < (input[0].charAt(0) - '0'); i++){
            name[i] = br.readLine();
        }
        int count = 0;
        for(int i = 0; i < (input[0].charAt(0) - '0'); i++){
            if(name[i].contains(input[1])){
                count++;
            }
        }
        System.out.print(count);
    }
}
