import java.awt.Desktop.Action;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedWriter;
import java.util.Comparator;
import java.util.PriorityQueue;





public class Main {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int loop = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queueHigh = new PriorityQueue<Integer>(); // 작은거 넣는 곳 내림차순
		PriorityQueue<Integer> queueLow = new PriorityQueue<Integer>(Comparator.reverseOrder()); //큰거 넣는 곳 오름차순
 		for(int i=0; i<loop; i++) {
			int action = Integer.parseInt(br.readLine());
			if(queueLow.size()==queueHigh.size()) { 
				queueLow.add(action);
				if(!queueHigh.isEmpty()&& queueLow.peek()>queueHigh.peek()) {
					queueHigh.add(queueLow.poll());
					queueLow.add(queueHigh.poll());
				}
			}
			else {
				queueHigh.add(action);
				if(queueHigh.peek() < queueLow.peek()) {
					queueHigh.add(queueLow.poll());
					queueLow.add(queueHigh.poll());
				}
			}
			bw.write(queueLow.peek()+"\n");
		}
 		bw.flush();
	}
}
