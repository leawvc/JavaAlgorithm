import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(in));
        int i = Integer.parseInt(br.readLine());
        String [] num = br.readLine().split(" ");
        int x = 1, y = 1;

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
        for (int j = 0; j < num.length; j++){
            char move = num[j].charAt(0);
            int nx = 0;
            int ny = 0;
            for(int k = 0; k < 4; k++){
                if (moveTypes[k] == move){
                    nx = x + dx[k];
                    ny = y + dy[k];
                } 
            }
            if((nx == 0)|| (ny == 0))continue;
            x = nx;
            y = ny;
        }
        System.out.println(x + " " + y);
    }
}
