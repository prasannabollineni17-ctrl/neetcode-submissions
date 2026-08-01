class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int longest_sequence=1;
        int length=1;
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==prev){
                length++;
                prev=nums[i];
                longest_sequence=Math.max(longest_sequence,length);
            }
            else if(nums[i]!=prev){
                prev=nums[i];
                length=1;
            }
        }
        return longest_sequence;
    }
}
