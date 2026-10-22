class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0 ; 
        for(int x : nums){
            total += x ;
        }
        int left_sum = 0;
        for(int i =0 ; i< nums.length ;i++){
            total -= nums[i] ;
            if(left_sum == total){
                return i ;
            }
            else {
                left_sum += nums[i] ;
            }
        }
        return -1 ;
    }
}