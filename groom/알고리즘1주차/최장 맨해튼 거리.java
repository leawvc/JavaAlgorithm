import java.io.*;
import java.lang.reflect.Parameter;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        Arrays.stream(input).sorted();
        int result = 0;
        int x1 = Integer.parseInt(input[0]);
        int x2 = Integer.parseInt(input[1]);
        int y1 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        result = Math.abs(y2 - x1) + Math.abs(y1 - x2);
        System.out.print(result);
    }
}
