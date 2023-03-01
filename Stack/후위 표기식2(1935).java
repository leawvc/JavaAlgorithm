package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Double> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Double [] num = new Double[n];
        for (int i = 0; i < n; i++){
            num[i] = Double.parseDouble(br.readLine());
        }
        for (int i = 0; i < str.length(); i++){
            if ('A' <= str.charAt(i) && str.charAt(i)<= 'Z'){
                stack.push(num[str.charAt(i) - 'A']);
            }else {
                if (!stack.isEmpty()){
                    double first = stack.pop();
                    double second = stack.pop();
                    switch (str.charAt(i)){
                        case '+' : {
                            stack.push(second + first);
                            continue;
                        }
                        case '-' : {
                            stack.push(second - first);
                            continue;
                        }
                        case '*' : {
                            stack.push(second * first);
                            continue;
                        }
                        case '/' : {
                            stack.push(second / first);
                            continue;
                        }
                    }
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
