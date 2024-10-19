class Solution {
    public double solution(int[] arr) {
        double result=0;
        for(int num : arr){
            result+= num;
        }
        return result/arr.length;
    }
}