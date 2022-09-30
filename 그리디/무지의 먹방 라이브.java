import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] food = new int[n];
        for (int i = 0; i < n; i++){
            food[i] = sc.nextInt();
        }
        int count = 0;
        int result = 0;
        while (true){
            for (int i = 0; i < n; i++){
                if (food[i] > 0) {
                    food[i]--;
                }
                else if (food[i] == 0) i++;
                if (i >= n){
                    count = -1;
                    break;
                }
                result++;
                if (i == n - 1){
                    count = 1;
                }else count = i + 1;
            }
            if (result == k) break;
        }
        System.out.println(count);
    }
}
