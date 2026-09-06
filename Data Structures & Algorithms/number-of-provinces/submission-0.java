class Solution {
    public static void bfs(List<List<Integer>> adj,int[] vis,int node){
        Queue<Integer> q= new LinkedList<>();
        q.add(node);
        vis[node]=1;
        while(!q.isEmpty()){
            int val=q.poll();
            for(int num:adj.get(val)){
                if(vis[num]!=1){
                    vis[num]=1;
                    q.add(num);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>>  adj= new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected.length;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int count=0;
        int[] vis=new int[isConnected.length];
        Arrays.fill(vis,-1);
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==-1){
                count++;
                bfs(adj,vis,i);
            }
        }
        return count;
    }
}