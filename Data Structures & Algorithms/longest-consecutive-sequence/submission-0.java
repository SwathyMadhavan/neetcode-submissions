class Solution {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int tempmax = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                tempmax++;
            }

            else {
                tempmax = 1;
            }

            max = Math.max(max, tempmax);
        }

        return max;
    }
}