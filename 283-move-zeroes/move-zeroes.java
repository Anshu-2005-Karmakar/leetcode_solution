class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0 , N = nums.length ;
        for (int x : nums ){
            if(x != 0){
                nums[j] = x ;
                j++ ;
            }
        }
        while(j<N){
            nums[j++] = 0 ;
        }
        
    }
}