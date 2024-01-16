import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken());
		final int TARGET = Integer.parseInt(st.nextToken());
		int basicArr[] = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N;i++) {
			basicArr[i] = Integer.parseInt(st.nextToken());
		}
		int start = 0;
		int end = 0;
		int total = 0;
		int min = Integer.MAX_VALUE;
		while(end<=N && start<=N) {
			if(total >= TARGET && min>end-start) {
				min = end-start;
			}
			if(total <TARGET) total += basicArr[end++];
			else total -= basicArr[start++];
		}
		if(min==Integer.MAX_VALUE) System.out.println(0);
		else System.out.println(min);
	}
}
