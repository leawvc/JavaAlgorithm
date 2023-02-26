package org.example;

import java.util.Scanner;
public class Main {
    static int[] q = new int[2000000];
    static int size = 0;
    static int front = 0;
    static int back = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.print(sb);
    }
    public static void push(int n){
        q[back] = n;
        size++;
        back++;
    }
    public static int pop(){
        if (size != 0){
            int n = q[front];
            q[front] = 0;
            front++;
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
    public static int front(){
        if (size != 0)
            return q[front];
        return -1;
    }
    public static int back(){
        if (size != 0)
            return q[back - 1];
        return -1;
    }
}

https://www.acmicpc.net/problem/18258
