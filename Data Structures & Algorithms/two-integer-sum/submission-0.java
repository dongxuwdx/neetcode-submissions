class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int sub = target - nums[i];
            if(mp.containsKey(sub)){
                return new int[]{mp.get(sub), i};
            }
            mp.put(nums[i], i);
        }
        return new int[2];
    }
}
