import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Jewelry{
	int weight;
	int price;
	public Jewelry(int weight, int price) {
		this.weight = weight;
		this.price = price;
	}
}

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Jewelry [] jewelry = new Jewelry[N];
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int weight = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			jewelry[i]= new Jewelry(weight, price); 
		}
		Arrays.sort(jewelry, new Comparator<Jewelry>() {
			@Override
			public int compare(Jewelry o1, Jewelry o2) {
				if(o1.weight!=o2.weight) return o1.weight - o2.weight;
				else return o2.price-o1.price;
			}
		});
		int[] bags = new int[K];
        for (int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(bags);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long ans = 0;
        for(int i=0, j=0; i<K; i++) {
        	while(j<N&&jewelry[j].weight <= bags[i]) {
        		pq.add(jewelry[j++].price);
        	}
        	if(!pq.isEmpty())
        		ans += pq.poll();
        }
        System.out.println(ans);
        br.close();
	}
}
