import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stk = new Stack<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int [N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		for(int i=0; i<N; i++) {
			while(!stk.isEmpty() && arr[stk.peek()]<arr[i]) {
				arr[stk.pop()] = arr[i];
			}
			stk.push(i);
		}
		while(!stk.isEmpty()) {
			arr[stk.pop()] = -1;
		}
		for(int i=0; i<N; i++) {
			bw.write(arr[i]+" ");
		}
		bw.flush();
	}
}
 