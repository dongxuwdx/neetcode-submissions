class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sCharCount = getCharCountByString(s);
        int[] tCharCount = getCharCountByString(t);
        for(int i = 0;i<26;i++){
            if(sCharCount[i]!=tCharCount[i]){
                return false;
            }
        }
        return true;
    }

    private int[] getCharCountByString(String s){
        char[] chars = s.toCharArray();
        int[] charCount = new int[26];
        for(int i = 0;i<chars.length;i++){
            charCount[chars[i]-'a']++;
        }
        return charCount;
    }
}
