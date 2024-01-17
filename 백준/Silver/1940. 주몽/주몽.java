import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = Integer.parseInt(br.readLine());
		final int TARGET = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int [] armor = new int[N];
		for(int i=0; i<N;i++) {
			armor[i] = Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(armor);
		int startIndex = 0;
		int endIndex = N-1;
		int count = 0;
		while(endIndex>startIndex) {
			int val = armor[endIndex] + armor[startIndex];
			if(val==TARGET) count ++;
			if(val<TARGET) startIndex++;
			else endIndex--;
		}
		System.out.println(count);
	}
}
