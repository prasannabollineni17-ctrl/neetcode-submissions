class Solution {
    
    public int rob(int[] nums) {
        
        int prev1=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1)  pick+=prev2;
            int non_pick=prev1;
            int curr=Math.max(pick,non_pick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
