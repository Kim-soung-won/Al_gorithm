import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean [] visited;
    static boolean arrive;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        arr = new ArrayList[A];
        for(int i=0; i<A; i++){
            arr[i] = new ArrayList<Integer>();
        }
        visited = new boolean[A];
        for(int i=0;i<N;i++){
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[a].add(e);
            arr[e].add(a);
        }
        for(int i=0; i<A; i++) {
            DFS(i, 1);
            if(arrive)
                break;
        }
        if(arrive) System.out.println(1);
        else System.out.println(0);
    }
    static void DFS(int start,int depth){
        if(depth==5){
            arrive = true;
            return;
        }
        visited[start] = true;
        for(int i : arr[start]){
            if(!visited[i]) {
                DFS(i, depth + 1);
            }
        }
        visited[start] = false;
    }
}