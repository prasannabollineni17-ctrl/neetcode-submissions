class Solution {
    public static  void helper(List<List<Integer>> answer,List<Integer> temp,int[] nums,int i){
        if(i==nums.length){
            answer.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(answer,temp,nums,i+1);
        temp.remove(temp.size()-1);
        helper(answer,temp,nums,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer=  new ArrayList<>();
        List<Integer>  temp=  new ArrayList<>();
        helper(answer,temp,nums,0);
        return answer;
    }
}
