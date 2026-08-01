class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        HashMap<String,List<String>> map=  new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(strs[i]);
            }
            else {
                map.put(s,new ArrayList<>());
                map.get(s).add(strs[i]);
            }
        }
        for(String key:map.keySet()){
            result.add(map.get(key));
        }
        return result;

    }
}
