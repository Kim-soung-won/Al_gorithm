import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int N = Integer.parseInt(br.readLine());
		int countNice = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		long nums[] = new long[N];
		for(int i=0; i<N; i++) {
			nums[i] = Long.parseLong(st.nextToken()); 
		}
		Arrays.sort(nums);
		for(int i=0; i<N; i++) {
			long TARGET = nums[i];
			int end = N-1;
			int start = 0;
			while(end>start) {
				long val = nums[end]+nums[start];
				if(val==TARGET) { 
					if(start!=i && end != i) {
						countNice++;
						break;
					}
					else if(start==i) start++;
					else if(end == i) end--;
				}
				else if(val<TARGET) start++;
				else end--;
			}
		}
		System.out.println(countNice);
		br.close();
	}
}
