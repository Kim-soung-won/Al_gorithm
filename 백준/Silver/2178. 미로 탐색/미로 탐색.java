import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int arr[][];
    static boolean visited[][];
    static int N,M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(line.substring(j,j+1));
            }
        }
        BFS(0,0);

        System.out.println(arr[N-1][M-1]);
    }
    static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x,y});
        visited[x][y] = true;
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            for(int k=0; k<4; k++){
                int a = now[0] + dx[k];
                int b = now[1] + dy[k];
                if(a>=0 && b>=0 && a<N && b<M){
                    if(arr[a][b]!=0 && !visited[a][b]) {
                        visited[a][b] = true;
                        arr[a][b] = arr[now[0]][now[1]] + 1;
                        queue.add(new int[]{a, b});
                    }
                }
            }
        }
    }
}