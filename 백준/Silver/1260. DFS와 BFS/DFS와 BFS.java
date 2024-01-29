import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean visited[];
    static Queue<Integer> q = new LinkedList<Integer>();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int M = Integer.parseInt(st.nextToken());
        final int N = Integer.parseInt(st.nextToken());
        arr = new ArrayList[M+1];
        visited = new boolean[M+1];
        final int startNum = Integer.parseInt(st.nextToken());
        for(int i=1; i<M+1; i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for(int i=1; i<=M; i++){
            Collections.sort(arr[i]);
        }
        DFS(startNum);
        bw.newLine();
        visited = new boolean[M+1];
        BFS(startNum);
        bw.flush();

    }
    static void DFS(int v) throws IOException{
        if(visited[v]){
            return;
        }
        visited[v]=true;
        bw.write(v+" ");
        for(int a : arr[v]){
            DFS(a);
        }
    }
    static void BFS(int v) throws IOException{
        if(visited[v]){
            return;
        }
        q.add(v);
        visited[v] = true;
        while(!q.isEmpty()){
            v = q.poll();
            bw.write(v + " ");
            for(int i : arr[v]){
                if(!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}