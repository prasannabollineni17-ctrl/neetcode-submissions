class  pair{
    int first;
    int second;
    public pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public void bfs(int ro,int co,int[][] image,int[][] visited,int color,int same){
        int m=image.length;
        int n=image[0].length;
        visited[ro][co]=1;
        image[ro][co]=color;
        Queue<pair> q= new LinkedList<>();
        q.add(new pair(ro,co));
        while(!q.isEmpty()){
            int row=q.peek().first;
            int col=q.peek().second;
            q.remove();
            int[] delrow={-1,0,1,0};
            int[] delcol={0,-1,0,1};
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0 && nrow<m &&  ncol>=0 && ncol<n && visited[nrow][ncol]==0 && image[nrow][ncol]==same){
                    visited[nrow][ncol]=1;
                    image[nrow][ncol]=color;
                    q.add(new pair(nrow,ncol));
                }
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int[][] visited= new int[m][n];
        int same=image[sr][sc];
        bfs(sr,sc,image,visited,color,same);
        return image;
    }
}