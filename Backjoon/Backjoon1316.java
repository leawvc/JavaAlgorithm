import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++){
            String word = sc.next();
            boolean check [] = new boolean[26];
            boolean checkNum = true;
            for (int j = 0; j < word.length(); j++){
                int index = word.charAt(j) - 'a';
                if (check[index]){
                    if (word.charAt(j) != word.charAt(j - 1)){
                        checkNum = false;
                        break;
                    }
                }else
                    check[index] = true;
            }
            if (checkNum)sum++;
        }
        System.out.println(sum);
    }
}