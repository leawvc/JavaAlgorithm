import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++) {
            int j = sc.nextInt();
            arr = new int[j];
            double sum = 0;

            for(int k = 0 ; k < j ; k++) {
                int grade = sc.nextInt();
                arr[k] = grade;
                sum += grade;
            }

            double avg = (sum / j) ;
            double count = 0;

            for(int m = 0 ; m < j ; m++) {
                if(arr[m] > avg) {
                    count++;
                }
            }

            System.out.printf("%.3f%%\n",(count/j)*100);
        }
        sc.close();
    }
}