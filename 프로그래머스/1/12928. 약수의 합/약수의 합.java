class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int k=1; k<=n/2; k++){
            if(n%k==0){
                answer += k;
            }
        }
        return answer + n;
    }
}