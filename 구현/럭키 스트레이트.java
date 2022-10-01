import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int result = 0;
        for (int i = 0; i < n.length()/2; i++){
            result += n.charAt(i);
        }
        for (int i = n.length()/2; i < n.length(); i++){
            result -= n.charAt(i);
        }
        if (result == 0){
            System.out.println("LUCKY");
        }else System.out.println("READY");
    }
}
