class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len=0, maxLen=0,start=0;
        for(int end=0;end<s.length();end++){
            while(set.contains(s.charAt(end))){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(s.charAt(end));
                len = end - start +1;
                maxLen = Math.max(len,maxLen);
            
        }
        return maxLen;
        
    }
}
