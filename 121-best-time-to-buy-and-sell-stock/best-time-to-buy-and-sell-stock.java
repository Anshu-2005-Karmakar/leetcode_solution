class Solution {
    public static int maxProfit(int[] prices) {
        int minpro = prices[0];
        int maxpro = 0 ;
        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] < minpro)
                minpro = prices[i] ;
            else{
                int pro = prices[i] - minpro ;
                if(pro > maxpro)
                    maxpro = pro ;
            }
        }
        return maxpro ;
    }
    public static void main(String [] args){
        int [] pri = {10,8,7,6,5,4};
        System.out.println(maxProfit(pri));
    }
}