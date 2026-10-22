class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0 , count = 0 ;
        for(int x : nums){
            if(count == 0 ){
                candidate = x ;
            }
            count += (x == candidate) ? 1 : -1 ;
        }
        count = 0 ;
        for(int x : nums){
            if(x == candidate){
                count ++ ;
            }
        }
        return (count > nums.length/2)?candidate:null ;
    }
}