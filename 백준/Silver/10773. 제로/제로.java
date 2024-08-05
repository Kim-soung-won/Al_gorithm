import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int answer = 0;
        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        bw.write(answer + "\n");
        bw.flush();
    }
}