import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.concurrent.CountDownLatch;


public class Main {

	private static int TARGETDNA[] = new int[4];
	private static int FINDDNA[] = new int[4];

	private static char[] word;

	static void ADD(char a) {
		if(a=='A') FINDDNA[0]++;
		else if(a=='C') FINDDNA[1]++;
		else if(a=='G') FINDDNA[2]++;
		else if(a=='T') FINDDNA[3]++;
	}
	static void DELETE(char a) {
		if(a=='A') FINDDNA[0]--;
		else if(a=='C') FINDDNA[1]--;
		else if(a=='G') FINDDNA[2]--;
		else if(a=='T') FINDDNA[3]--;
	}
	static int calc() {
		if(FINDDNA[0]<TARGETDNA[0]) return 0;
		if(FINDDNA[1]<TARGETDNA[1]) return 0;
		if(FINDDNA[2]<TARGETDNA[2]) return 0;
		if(FINDDNA[3]<TARGETDNA[3]) return 0;
		return 1;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int STRLENGTH = Integer.parseInt(st.nextToken());
		final int FINDLENGTH = Integer.parseInt(st.nextToken());
		word = br.readLine().toCharArray();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			TARGETDNA[i] = Integer.parseInt(st.nextToken());
		}
		int end = FINDLENGTH;
		int start = 0;
		int count = 0;
		for(int j=0; j<FINDLENGTH; j++) {
			if(word[j]=='A') FINDDNA[0]++;
			else if(word[j]=='C') FINDDNA[1]++;
			else if(word[j]=='G') FINDDNA[2]++;
			else if(word[j]=='T') FINDDNA[3]++;
		}
		count += calc();
		while(end<STRLENGTH) {
			ADD(word[end]);
			DELETE(word[start]);
			count += calc();
			end++;
			start++;
		}
		System.out.println(count);
	}
}
