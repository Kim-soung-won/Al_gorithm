import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            int AA = Integer.parseInt(br.readLine());
            visited = new boolean[AA+1];
            int [] arr = new int [AA+1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<AA+1; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int count = 0;
            for(int j=1; j<AA+1; j++){
                if(!visited[j]){
                    count++;
                }
                DFS(j,arr);
            }
            System.out.println(count);
        }
    }
    static void DFS(int v, int [] arr){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        DFS(arr[v],arr);
    }
}