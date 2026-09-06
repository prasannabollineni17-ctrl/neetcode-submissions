class Solution {
    public static void dfs(char [][] grid,int[][] vis,int row,int col,int n,int m){
        vis[row][col]=1;
        int[] delrow={-1,0,1,0};
        int[]  delcol={0,-1,0,1};
        for(int i=0;i<4;i++){
            int nr=row+delrow[i];
            int nc=col+delcol[i];
            if(nr>=0 && nr<n && nc>=0 && nc<m && vis[nr][nc]==-1 && grid[nr][nc]=='1'){
                dfs(grid,vis,nr,nc,n,m);
            }
        }


    }
    public int numIslands(char[][] grid) {
        int answer=0;
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis= new int[n][m];
        for(int i=0;i<vis.length;i++){
            Arrays.fill(vis[i],-1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && vis[i][j]==-1){
                    answer++;
                    dfs(grid,vis,i,j,n,m);
                }
            }
        }
        return answer;
    }
}
