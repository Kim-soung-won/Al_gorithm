import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken());
		final int M = Integer.parseInt(st.nextToken());
		long sumArr[] = new long[N];
		long c[] = new long[M];
		long count = 0;
		st = new StringTokenizer(br.readLine());
        sumArr[0] = Integer.parseInt(st.nextToken());
		for(int i=1; i<N; i++) {
			sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken());
		}
		for(int i=0; i<N; i++) {
			int rere = (int) (sumArr[i]%M);
			if(rere==0) {
				count++;
			}
			c[rere]++; 
		}
		for(int i=0; i<M; i++) {
			if(c[i]>1) {
				count += (c[i]*(c[i]-1)/2);
			}
		}
		System.out.println(count);
	}
}
