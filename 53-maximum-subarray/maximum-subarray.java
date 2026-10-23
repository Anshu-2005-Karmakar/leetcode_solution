class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length ;
        int max_sofar = Integer.MIN_VALUE ;
        int max_end = 0 ;
        for(int i =0 ; i< n ; i++){
            max_end += nums[i];
            if(max_sofar < max_end ){
                max_sofar = max_end ;
            }
            if(max_end < 0 ){
                max_end = 0 ;
            }
        }
        return max_sofar ;
    }
}