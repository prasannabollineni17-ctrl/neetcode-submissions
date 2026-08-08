class Solution {
    public static int helper(int n){
        int count=0;
        while(n>0){
            n&=(n-1);
            count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] answer= new int[n+1];
        for(int i=0;i<=n;i++){
            answer[i]=helper(i);
        }
        return answer;
    }
}
