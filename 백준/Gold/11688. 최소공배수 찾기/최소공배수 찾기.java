import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long[] arr = {Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())};
        if (arr[2]%arr[0]!=0 || arr[2]%arr[1]!=0) {System.out.println(-1); return; }
        if (arr[0]*arr[1] == arr[2]) {System.out.println(1); return; }
        long gcd = gcd(arr[0], arr[1]);
        long lcm = (arr[0]*arr[1])/gcd;
        ArrayList<Long> arrSort = divisor(arr[2]);
        for(long i : arrSort){
            if((lcm*i)/gcd(lcm,i)==arr[2]){
                System.out.println(i);
                return;
            }
        }
    }
    public static long gcd(long a, long b) {
        if (a%b==0) return b;
        return gcd(b, a%b);
    }
    public static ArrayList<Long> divisor(long l){
        ArrayList<Long> arr = new ArrayList<Long>();
        for(long i=1; i<=Math.sqrt(l); i++){
            if(l%i==0){
                arr.add(i);
                arr.add(l/i);
            }
        }
        Collections.sort(arr);
        return arr;
    }
}