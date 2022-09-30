import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] token = new int[n];
        for (int i = 0; i < n; i++){
            token[i] = sc.nextInt();
        }
        Arrays.sort(token);
        int result = 1;
        for (int j = 0; j < n; j++){
            if (result < token[j]) break;
            result += token[j];
        }
        System.out.println(result);
    }
}
