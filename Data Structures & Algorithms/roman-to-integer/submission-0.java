class Solution {
    public static int value(char ch){
        if(ch=='I') return 1;
        if(ch=='V') return 5;
        if(ch=='X') return 10;
        if(ch=='L') return 50;
        if(ch=='C') return 100;
        if(ch=='D') return 500;
        return 1000;
    }
    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(i<s.length()-1  && value(s.charAt(i))<value(s.charAt(i+1))) total-=value(ch);
            else total+=value(ch);

        }
        return total;
    }
}