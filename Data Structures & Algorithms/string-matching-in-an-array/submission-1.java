class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<words.length;j++){
                if(j!=i){
                    String sc=words[j];
                    if(sc.contains(s) && !result.contains(s)){
                        result.add(s);
                    }
                }
        }
        }
        return result;
    }
}