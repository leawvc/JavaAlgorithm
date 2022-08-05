import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45){
            M = M + 15;
            if (H == 0){
                H = 23;
            }
            else H = H -1;
        }
        else {
            M = M - 45;
            H = H;
        }
        System.out.println(H + " " + Math.abs(M));
    }
}