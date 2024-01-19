import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int a = 1;
		Stack<Integer> stk = new Stack<Integer>();
		while(N-->0) {
			int target = Integer.parseInt(br.readLine());
			if(a <= target) {
				while(a<=target) {
					stk.push(a);
					a++;
					sb.append("+\n");
				}
				stk.pop();
				sb.append("-\n");
			}
			else if(stk.peek()==target) {
				stk.pop();
				sb.append("-\n");
			}
			else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println(sb);
	}
}
 