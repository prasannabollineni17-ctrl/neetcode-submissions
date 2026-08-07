class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int number_of_subarrays=0;
        int current=0;
        for(int i=0;i<k;i++){
            current+=arr[i];
        }
        if(current/k >=threshold) number_of_subarrays++;
        for(int i=k;i<arr.length;i++){
            int in=i;
            int out=i-k;
            current+=arr[in];
            current-=arr[out];
            if(current/k >=threshold) number_of_subarrays++;
        }
        return number_of_subarrays;
        
    }
}