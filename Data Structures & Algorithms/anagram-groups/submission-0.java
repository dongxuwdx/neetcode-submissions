class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String orderString = new String(chars);
            if(mp.containsKey(orderString)){
                mp.get(orderString).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                mp.put(orderString, list);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
