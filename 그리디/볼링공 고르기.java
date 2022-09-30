import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] ball = new int[n];
        for (int i = 0; i < n; i++){
            ball[i] = sc.nextInt();
        }
        Arrays.sort(ball);
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (ball[i] < ball[j]) count++;
            }
        }
        System.out.println(count);
    }
}
