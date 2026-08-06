class Solution {
    public int[][] generateMatrix(int n) {
        int[][] answer=  new int[n][n];
        int left=0;
        int top=0;
        int right=n-1;
        int bottom=n-1;
        int val=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                answer[top][i]=val;
                val++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                answer[i][right]=val;
                val++;
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                answer[bottom][i]=val;
                val++;
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom;i>=top;i--){
                answer[i][left]=val;
                val++;
            }
            left++;
            }
        }
        return answer;
    }
}