class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length ;
        int k = -1 ;
        boolean flag = false ;
        for(int i = 0 ; i < n ; i ++){
            if(nums[i] != i ){
                k = k & nums[i] ;
                flag = true ;
            }
        }
       
        if(!flag){
            return 0 ;
        }
        return k ;
        
    }
}