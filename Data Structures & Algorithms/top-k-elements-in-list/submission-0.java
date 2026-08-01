class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer= new int[k];
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++){
            answer[i]=list.get(i).getKey();
        }
        return answer;
    }
}
