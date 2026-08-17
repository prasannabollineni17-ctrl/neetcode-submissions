class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> s= new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(s.contains(third)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                s.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
}
