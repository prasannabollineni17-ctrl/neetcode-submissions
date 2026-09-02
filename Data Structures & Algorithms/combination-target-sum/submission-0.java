class Solution {
    static Set<List<Integer>> st= new HashSet<>();
    public static void helper(List<List<Integer>> answer,List<Integer> temp,int[] nums,int i,int target){
        if(i==nums.length || target<0){
            return;
        }
        if(target==0){
            if(!st.contains(temp)){
                st.add(temp);
                answer.add(new ArrayList<>(temp));
                return;
            }
            
        }
        temp.add(nums[i]);
        helper(answer,temp,nums,i+1,target-nums[i]);
        helper(answer,temp,nums,i,target-nums[i]);
        temp.remove(temp.size()-1);
        helper(answer,temp,nums,i+1,target);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> answer= new ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        helper(answer,temp,nums,0,target);
        return answer;
    }
}
