class Main {
    public static int fibo(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }else {
            return fibo(x - 1) + fibo(x - 2);
        }
    }
    public static void main(String[] args){
        System.out.println(fibo(6));
    }
}
