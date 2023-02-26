package org.example;

import java.util.Scanner;
public class Main {
    public static int[] stack;
    public static int size = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        stack = new int[n];
        for (int i = 0; i < n; i++){
            String str = sc.next();
            switch (str){
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
    public static void push(int n){
        stack[size] = n;
        size++;
    }
    public static int pop(){
        if (size != 0){
            int n = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return n;
        }
        return -1;
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if (size != 0)
            return 0;
        return 1;
    }
    public static int top(){
        if (size != 0)
            return stack[size - 1];
        return -1;
    }
}
