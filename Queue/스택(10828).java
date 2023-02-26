import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String str = sc.next();
            System.out.println(check(str));
        }
    }
    public static String check(String s){
        Stack<Character> stack = new Stack<>();
        for(int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            if(c == '('){
                stack.push(c);
            }else if(stack.empty()){
                return "NO";
            }else{
                stack.pop();
            }
        }
        if(stack.empty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}

https://www.acmicpc.net/problem/10828
