import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 거스름돈 {
    Scanner sc = new Scanner(System.in);
    int price = sc.nextInt();
    int sum = 0;
    ArrayList<Integer> integers5 = new ArrayList<>(Arrays.asList(500,100,50,10));
        for (int i :integers5){
        sum += price/i;
        price %= i;
    }
        System.out.println(sum);
}
