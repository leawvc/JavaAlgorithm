import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    Queue<Integer> q = new LinkedList<>(); 
	    System.out.print("<");
	    for(int i = 1; i <= N; i++){
	        q.add(i);
	    }
	    while (q.size()> 1){
	        for (int i = 0;i < K - 1; i++){
	            int a = q.poll();
	            q.add(a);
	        }
	        System.out.print(q.poll()+", ");
		}
	    System.out.print(q.poll()+">");
	}
}

https://www.acmicpc.net/problem/1158
