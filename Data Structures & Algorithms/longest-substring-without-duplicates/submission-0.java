class Solution {
    public int lengthOfLongestSubstring(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        boolean[] seen = new boolean[128];
        int maxLen = 0;

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            while(seen[c]){
                char removed = deque.pollFirst();
                seen[removed] = false;
            }
            seen[c] = true;
            deque.offerLast(c);
            maxLen = Math.max(maxLen, deque.size());
        }

        return maxLen;
    }
}
