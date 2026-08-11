class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        if(numRows==1){
            List<Integer> list= new ArrayList<>();
            list.add(1);
            result.add(list);
            return result;
        }
        List<Integer> list= new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int i=2;i<=numRows;i++){
            List<Integer> current= new ArrayList<>();
            
                current.add(1);
                for(int j=1;j<i-1;j++){
                    current.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
                }
                current.add(1);

            
            result.add(current);
        }
        return result;
    }
}