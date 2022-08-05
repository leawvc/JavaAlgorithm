public class Main {
    public static void main(String[] args) {
        boolean [] num_list = new  boolean[10001];
        for (int i = 0; i < num_list.length; i++){
            int j = discrimination(i);
            if (j < 10001){
                num_list[j] = true;
            }
        }
        for (int k = 1; k < num_list.length; k++){
            if (!num_list[k]){
                System.out.println(k);
            }
        }
    }
    public static int discrimination(int num){
        int sum = num;
        while (num != 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
}