/***
length#stringlength#stringlength#stringlength#string

4#leng2#ss3#$$$6#1234561#a



***/

class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){
            return "";
        }
        String encodeString = "";
        for(String str : strs){
            encodeString+=(str.toCharArray().length + "#" + str);
        }
        return encodeString;
    }

    public List<String> decode(String str) {
        if(str.equals("")){
            return new ArrayList<>();
        }
        char[] strChars = str.toCharArray();
        String subString = "";
        int index = 0;
        int len = strChars.length;
        List<String> ans = new ArrayList<>();
        while(index<len){
            if(subString==""){
                int number = 0;
                while(strChars[index]!='#'){
                    number = number*10 + strChars[index] - '0';
                    index++;
                }
                index++;
                for(int i = 0;i<number&&index<len;i++){
                    subString+=strChars[index];
                    index++;
                }
                ans.add(subString);
                subString = "";
            }
        }
        return ans;
    }
}
