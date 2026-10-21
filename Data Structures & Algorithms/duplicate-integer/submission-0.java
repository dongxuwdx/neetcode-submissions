class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len==0){
            return false;
        }
        int currNumber = nums[0];
        for(int i = 1;i<len;i++){
            if(currNumber!=nums[i]){
                currNumber = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}