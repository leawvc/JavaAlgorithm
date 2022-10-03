import java.util.*;

class Main {
    public static void main(String[] args){
        ArrayList<Character> text = new ArrayList<>();
        int num = 0;
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        for (int i = 0; i < n.length(); i++){
            if ('A' <= n.charAt(i) && n.charAt(i) <= 'Z'){
                text.add(n.charAt(i));
            }
            else num += n.charAt(i) - '0';
        }
        Collections.sort(text);
        for (int i = 0; i < text.size(); i++){
            System.out.printf(String.valueOf(text.get(i)));
        }
        if (num != 0) System.out.println(num);
    }
}
