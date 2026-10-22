/**

min = 2
max = 20

for 2 ~ 20 exsit in map
    ans = 1
    num = 2
    while(if num + 1 exsit in map)
        ans++
        num = num + 1
    result = max(result, ans)


**/

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans = 1;
        for(int num : set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int largestAns = 1;
                while(set.contains(currentNum+1)){
                    largestAns+=1;
                    currentNum+=1;
                }
                ans = Math.max(ans, largestAns);
            }
        }
        return ans;
    }
}
