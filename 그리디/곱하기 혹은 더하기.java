import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int result = 0;
        for (int i = 0; i < num.length(); i++){
            if (num.charAt(i) < 2 || result == 0){
                result += (num.charAt(i) - 48);
            }else result *= (num.charAt(i) - 48);
        }
        System.out.println(result);
    }
}
