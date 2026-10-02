class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums)
         set.add(num);

        int maxLen=0;
         // [ 1,2,3,10,4,5,22]
        for(int num: set){
          if(!set.contains(num-1)){
            int current = num;
            int templen = 1;
            while(set.contains(current+1)){
               templen++;
               current++;
            }
            maxLen = Math.max(templen, maxLen);
          }
        }
        return maxLen;
    }
}
