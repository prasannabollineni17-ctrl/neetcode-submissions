class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int current=Integer.MIN_VALUE;
        current=Math.max(current,arr[n-1]);
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int val=arr[i];
            arr[i]=current;
            current=Math.max(current,val);
        }
        return arr;
    }
}