class Solution {
    public int appendCharacters(String s, String t) {
        int start=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(0)){
                start=i;
                break;
            }
        }
        int k=0;
        while(start<s.length() && k<t.length()){
            if(s.charAt(start)==t.charAt(k)){
                start++;
                k++;
            }
            else{
                start++;
            }
        }
        return t.length()-k;
    }
}