class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (result[0] == 0 && result[1] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == difference) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }

        }
        return result;
    }
}