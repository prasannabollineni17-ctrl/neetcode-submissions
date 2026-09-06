class Solution {
    public static void dfs(int[][] image,int sr,int sc,int color,int same,int[][] vis,int n,int m){
        vis[sr][sc]=1;
        image[sr][sc]=color;
        int[] delrow={-1,0,1,0};
        int[]delcol={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nr=sr+delrow[i];
            int nc=sc+delcol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && image[nr][nc]==same && vis[nr][nc]==-1){
                dfs(image,nr,nc,color,same,vis,n,m);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length;
        int m=image[0].length;
        int[][] vis= new int[n][m];
        for(int i=0;i<vis.length;i++){
            Arrays.fill(vis[i],-1);
        }
        int same=image[sr][sc];
        dfs(image,sr,sc,color,same,vis,n,m);
        return image;
    }
}