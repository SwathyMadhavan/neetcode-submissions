class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        boolean returntype= true;
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)>1){
               return true;
            }
         //   else 
           // returntype=false;
        }
        return false;
    }
}