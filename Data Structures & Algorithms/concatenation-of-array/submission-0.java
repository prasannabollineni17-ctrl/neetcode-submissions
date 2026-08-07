class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] concatenated_array= new int[2*n];
        for(int i=0;i<n;i++){
            concatenated_array[i]=nums[i];
            concatenated_array[i+n]=nums[i];
        }
        return concatenated_array;
    }
}