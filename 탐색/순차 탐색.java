import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int x = Integer.parseInt(st.nextToken());
        String name = st.nextToken();
        String [] arr = new String[x];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < x; i++){
            arr[i] = st.nextToken();
        }
        int result = 0;
        for (int i = 0; i < x; i++){
            if (arr[i].equals(name)){
                result = i + 1;
            }
        }
        System.out.println(result);
    }
}
