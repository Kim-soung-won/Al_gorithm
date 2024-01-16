import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int range[][] = new int[N][N];
		int total[][] = new int[N+1][N+1];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				range[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				total[i][j] = total[i][j-1] + total[i-1][j] -total[i-1][j-1] + range[i-1][j-1]; 
			}
		}
		for(int i=1; i<=M; i++) {
			st = new StringTokenizer(br.readLine());
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());
			bw.write(total[endX][endY]-total[endX][startY-1]-total[startX-1][endY]+total[startX-1][startY-1]+"\n");
		}
		bw.flush();
	}
}
