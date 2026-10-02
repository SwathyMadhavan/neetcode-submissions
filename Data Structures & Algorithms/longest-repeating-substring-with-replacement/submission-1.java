class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map =new HashMap<>();

        int windowlen=0, maxlen=0, start = 0,maxFreq=0;
        for(int end=0;end<s.length();end++){
            map.put(s.charAt(end),map.getOrDefault(s.charAt(end),0)+1);
            maxFreq = Math.max(maxFreq,map.get(s.charAt(end)));
            windowlen = end - start +1;

        if(k<windowlen-maxFreq){
            map.put(s.charAt(start), map.get(s.charAt(start))-1); 
            start++;
        }
        maxlen= Math.max(maxlen, end - start + 1);
            
        }
        return maxlen;
    }
}
