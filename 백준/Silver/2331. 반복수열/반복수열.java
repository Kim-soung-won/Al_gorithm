import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int mul = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(start);
        while(true){
            int temp = arr.get(arr.size()-1);
            int result =0;
            while(temp!=0){
                result += (int) Math.pow(temp%10,mul);
                temp /=10;
            }
            if(arr.contains(result)) {
                int ans = arr.indexOf(result);
                System.out.println(ans);
                break;
            }
            arr.add(result);
        }
    }
}