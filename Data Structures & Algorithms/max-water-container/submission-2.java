class Solution {
    public int maxArea(int[] heights) {
        int max=0;

        int l =0, r = heights.length-1, heightofwater=0;
        
        while(l<r){
            //    if(heights[l]<heights[r])
                heightofwater= Math.min(heights[l],heights[r]);
                int area = heightofwater * (r - l);
                if(heights[l]<heights[r])
                l++;
                else
                r--;
                max = Math.max(area,max);
        }
        return max;
    }
}
