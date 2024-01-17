import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken());
		final long M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long count =0;
		long sumArr[] = new long[N+1];
		for(int i=1; i<=N; i++) {
			sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken()); 
		}
		int startIndex =0;
		int endIndex = 1;
		if(sumArr[0]==M) count++; 
		while(endIndex<=N && startIndex<=N) {
			int now = (int) (sumArr[endIndex]-sumArr[startIndex]);
			if(now==M) count++;
			if(now>M) {
				startIndex++;
			}
			else {
				endIndex++;
			}
		}
		System.out.println(count);
	}
}
