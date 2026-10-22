class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        int[] cnt = new int[128];
        for(int i  = 0;i<t.length();i++){
            cnt[t.charAt(i)]++;
        }
        int left = 0, right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        while(right<s.length()){
            char r = s.charAt(right);
            if(cnt[r]>0){
                count--;
            }
            cnt[r]--;
            right++;
            while(count==0){
                if(minLen > right - left){
                    minLen = right - left;
                    startIndex = left;
                }
                char l = s.charAt(left);
                cnt[l]++;
                if(cnt[l]>0){
                    count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "":s.substring(startIndex, startIndex + minLen);
    }
}
