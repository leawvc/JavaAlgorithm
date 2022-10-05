import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [][] bingo = new String[5][5];
        boolean [][] check = new boolean[5][5];
        for (int i = 0; i < 25; i++){
            String[] num = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++){
                bingo[i][j] = num[j];
            }
        }
        int count = 0;
        int result;
        for (int i = 0; i < 5; i++){
            String[] num1 = sc.nextLine().split(" ");
            for (int j = 0; j < 5; j++){
                result = 0;
                if (Arrays.asList(bingo).contains(num1[j])){
                    check[i][j] = true;
                }
                if (check[0][0] == true && check[1][1] == true && check[2][2] == true && check[3][3] == true && check[4][4] == true){
                    result++;
                }
                if (check[4][0] == true && check[3][1] == true && check[2][2] == true && check[1][3] == true && check[0][4] == true){
                    result++;
                }
                if (check[4][j] == true && check[3][j] == true && check[2][j] == true && check[1][j] == true && check[0][j] == true){
                    result++;
                }
                if (check[j][0] == true && check[j][1] == true && check[j][2] == true && check[j][3] == true && check[j][4] == true){
                    result++;
                }
                if (result == 3)break;
                count++;
            }
        }
        System.out.println(count);
    }
}
