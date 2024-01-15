import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Time{
	int start;
	int end;
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int loop = Integer.parseInt(br.readLine());
		Time [] times = new Time[loop]; 
		for(int i=0; i<loop; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			times[i] = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())); 
		}
		Arrays.sort(times, new Comparator<Time>() {
			@Override
			public int compare(Time o1, Time o2) {
				if(o1.start!=o2.start) return o1.start - o2.start;
				else return o1.end - o2.end;
			}
		});
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(times[0].end);
		for(int i=1; i<loop; i++) {
			if(times[i].start>=pq.peek()) {
				pq.poll();
				pq.add(times[i].end);
			}
			else {
				pq.add(times[i].end);
			}
		}
		bw.write(pq.size()+"");
		bw.flush();
	}
}
