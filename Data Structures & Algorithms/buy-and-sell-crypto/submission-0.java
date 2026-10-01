class Solution {
    public int maxProfit(int[] arr) {
        int minP= Integer.MAX_VALUE;
        int maxProfitamount = 0;
        for(int i=0;i<arr.length;i++){
         if(minP>arr[i]){
            minP=arr[i];
         }
         else{
            int currProfit = arr[i] - minP;
            maxProfitamount = Math.max(maxProfitamount, currProfit);
         }
        }
       return maxProfitamount;
    }
}
