import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = N;
        int sum = 0;
        while (true) {
            if (N < 10){
                N = N * 10 + N;
            }
            else{
                int i = (N % 10 + N / 10) % 10;
                N = (N % 10) * 10 + i;
            }
            sum = sum + 1;
            if (M == N){
                System.out.println(sum);
                break;
            }
        }
    }
}