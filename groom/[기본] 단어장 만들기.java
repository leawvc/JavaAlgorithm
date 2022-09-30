import java.io.*;
import java.util.Arrays;

class Main {
    public static String tmp = "";
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        String [] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = br.readLine();
        }
        Arrays.sort(words);
        for (int j = 0; j < n; j++){
            for (int i = j + 1; i < n; i++){
                if (words[j].length() > words[i].length()){
                    tmp = words[j];
                    words[j] = words[i];
                    words[i] = tmp;
                }
            }
        }
        System.out.println(words[k-1]);
    }
}
