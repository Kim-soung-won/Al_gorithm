import java.io.*;
import java.util.*;

class Node{
    int target;
    int len;
    public Node(int target, int len){
        this.target = target;
        this.len = len;
    }
}

public class Main {
    static ArrayList<Node>[] arr;
    static boolean[] visited;
    static int[] len;
    static int ll;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        arr = new ArrayList[N+1];
        visited = new boolean[N+1];
        len = new int[N+1];
        for(int i=1; i<=N; i++){
            arr[i] = new ArrayList<Node>();
        }
        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            while(true){
                int k=Integer.parseInt(st.nextToken());
                if(k==-1){
                    break;
                }
                int p = Integer.parseInt(st.nextToken());
                arr[a].add(new Node(k,p));
            }
        }
        DFS(1,0);
        int Max = 1;
        for(int i=2; i<=N; i++){
            if(len[Max] < len[i])
                Max=i;
        }
        len = new int[N+1];
        visited = new boolean[N+1];
        DFS(Max,0);
        Arrays.sort(len);
        System.out.println(len[N]);

    }
    static void DFS(int index, int length){
        len[index] = length;
        visited[index] = true;
        for(Node node : arr[index]){
            if(!visited[node.target]) {
                DFS(node.target, length + node.len);
                if(len[ll] < len[node.target])
                    ll = node.target;
            }
        }
    }
}