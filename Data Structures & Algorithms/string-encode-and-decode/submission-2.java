class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(String s:strs){
            sb.append(s);
            sb.append("Hrushikesh");
            count++;
        }
        sb.append(String.valueOf(count));
        return sb.toString();
    }

    public List<String> decode(String str) {
        String[] arr = str.split("Hrushikesh");
        List<String> ls = new ArrayList<>();
        for(String i:arr){
            ls.add(i);
        }
        int n = Integer.parseInt(ls.remove(ls.size()-1));
        int len = ls.size();
        while(n-len!=0){
            ls.add("");
            len++;
        }
        return ls;
    }
}
