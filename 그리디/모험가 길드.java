import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] human = new int[num];
        for (int i = 0; i < num; i++){
            human[i] = sc.nextInt();
        }
        Arrays.sort(human);
        int count = 0;
        int result = 0;
        for (int j = 0; j < num; j++){
            count += 1;
            if (count >= human[j]){
                count = 0;
                result++;
            }
        }
        System.out.println(result);
    }
}
