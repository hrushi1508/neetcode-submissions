class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // find freq of unique chars
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // done with freq count

        // Sort HashMap using a MaxHeap
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.offer(entry);
        }
        // Sorting ends
        
        //create a new array of size k and fill with top k keys from pq
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
