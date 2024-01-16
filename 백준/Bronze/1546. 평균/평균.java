import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int scores[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}
		long MAX = 0;
		long total = 0;
		for(int i=0; i<N; i++) {
			if(scores[i]>MAX) MAX = scores[i];  
			total += scores[i];
		}
		System.out.println(total*100.0/MAX/N);
	}
}
