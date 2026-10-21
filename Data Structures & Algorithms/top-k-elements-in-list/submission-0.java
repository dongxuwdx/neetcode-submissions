class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            if(numberCountMap.containsKey(nums[i])){
                count = numberCountMap.get(nums[i]);
            }
            numberCountMap.put(nums[i], count+1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            queue.add(new int[]{key, value});
        }
        int[] ans = new int[k];
        int i = 0;
        while(i<k){
            ans[i] = queue.poll()[0];
            i++;
        }
        return ans;
    }
}


