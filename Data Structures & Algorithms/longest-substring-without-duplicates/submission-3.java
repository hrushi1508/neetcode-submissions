class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int j = 0;
        int len = 0;
        for(int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
                map.put(s.charAt(i),i);
                len = Math.max(len,i-j+1);
            
        }
        return len;
    }
}
