class Solution {
    public static void helper(List<List<Integer>> answer,List<Integer> temp,int[]  nums,int i){
        if(i==nums.length){
            answer.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(answer,temp,nums,i+1);
        temp.remove(temp.size()-1);
        int index=i+1;
        while(index<nums.length && nums[index]==nums[i]){
            index++;
        }
        helper(answer,temp,nums,index);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answer= new  ArrayList<>();
        List<Integer> temp= new ArrayList<>();
        helper(answer,temp,nums,0);
        return answer;
    }
}
