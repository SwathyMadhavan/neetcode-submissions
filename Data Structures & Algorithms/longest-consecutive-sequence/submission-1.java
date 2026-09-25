class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int num: nums){
        set.add(num);
       }
       int max = 0;
       for(int num: nums){
          if(!set.contains(num-1)){
           int current = num;
           int tempLen = 1;
           while(set.contains(current+1)){
            current++;
            tempLen++;
           }
           max = Math.max(max,tempLen);
          }

       }
       return max;
    }
}
