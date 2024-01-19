import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;


class CustomComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(Math.abs(o1) != Math.abs(o2)) return Math.abs(o1) - Math.abs(o2);
		else {
			if(o1>o2) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
}

public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int loop = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new CustomComparator());
		for(int i=0; i<loop; i++) {
			int action = Integer.parseInt(br.readLine());
			if(action==0) {
				if(queue.size()==0)
					bw.write(0+"\n");
				else
					bw.write(queue.poll()+"\n");
			}
			else {
				queue.add(action);
			}
		}
		bw.flush();
	}
}
