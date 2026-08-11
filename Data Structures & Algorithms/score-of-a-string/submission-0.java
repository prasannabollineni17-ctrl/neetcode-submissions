class Solution {
    public int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++){
            int j=i+1;
            int val1=s.charAt(i);
            int val2=s.charAt(j);
            score+=Math.abs(val1-val2);
        }
        return score;
    }
}