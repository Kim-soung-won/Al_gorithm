import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i =0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            int result = solution(num1, num2);
            int k = (num1*num2) / solution(num1, num2);
            bw.write(k + "\n");
        }
        bw.flush();
    }
    public static int solution(int a, int b){
        if (a%b == 0){
            return b;
        }
        return solution(b, a%b);
    }
}