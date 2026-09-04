class Solution {
    public static int help(List<Integer> list){
        int prev1=list.get(0);
        int prev2=0;
        for(int i=1;i<list.size();i++){
            int pick=list.get(i);
            if(i>1)  pick+=prev2;
            int non_pick=prev1;
            int curr=Math.max(pick,non_pick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        List<Integer> temp1=new ArrayList<>();
        List<Integer> temp2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1)  temp1.add(nums[i]);
            if(i!=0) temp2.add(nums[i]);
        }
        return Math.max(help(temp1),help(temp2));
    }
}