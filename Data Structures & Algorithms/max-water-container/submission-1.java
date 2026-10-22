class Solution {
    public int maxArea(int[] heights) {
        int len = heights.length;
        int ans = 0;
        int left = 0;
        int right = len - 1;
        while(left<right){
            ans = Math.max(ans, (right - left)*Math.min(heights[left], heights[right]));
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
