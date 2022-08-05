import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++){
            if (64 < str.charAt(i) && str.charAt(i) < 91){
                arr[str.charAt(i) - 'A']++;
            }else {
                arr[str.charAt(i) - 'a']++;
            }
        }
        int max = -1;
        char ch = '?';
        for (int i = 0 ; i < 26; i++){
            if (arr[i] > max){
                max = arr[i];
                ch = (char)(i+65);
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}