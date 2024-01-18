import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;


class dq{
	int index;
	int value;
	public dq(int index,int value) {
		this.index = index;
		this.value = value;
	}
}

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int STRLEN = Integer.parseInt(st.nextToken());
		int CUTLEN = Integer.parseInt(st.nextToken());
		Deque<dq> dq = new LinkedList<dq>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<STRLEN; i++) {
			int num = Integer.parseInt(st.nextToken());
			while(!dq.isEmpty()&& dq.getLast().value>num) {
				dq.removeLast();
			}
			dq.addLast(new dq(i, num));
			if(dq.getFirst().index<=i-CUTLEN)
				dq.removeFirst();
			bw.write(dq.getFirst().value+" ");
		}
		bw.flush();
	}
}
