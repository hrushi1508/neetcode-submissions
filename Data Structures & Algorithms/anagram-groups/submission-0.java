class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int arr[] = new int[26];
            for(char ch:strs[i].toCharArray()){
                arr[ch-'a']++;
            }
            String key = Arrays.toString(arr);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(key,temp);
            }
        }
        List<List<String>> ls = new ArrayList<>(map.values());
        return ls;
    }
}
