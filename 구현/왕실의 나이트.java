import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String location = sc.nextLine();
        int x = location.charAt(0)+ 1 - 'a';
        int y = location.charAt(1) - 48;
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
        int count = 0;
        for (int i = 0; i < 8; i++){
            if ((x + dx[i] < 1) || (y + dy[i] < 1) || (x + dx[i] > 8) || (y + dy[i] > 8)){
                continue;
            }else count++;
        }
        System.out.println(count);
    }
}
