class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

        List<Integer>[] list = new List[nums.length+1];
        for(int key:map.keySet()){
            //频率为i的key
            int i = map.get(key);
            if(list[i]==null){
                list[i] = new ArrayList<>();
            }
            list[i].add(key);
        }
        
        //倒序添加
        for(int i = nums.length;i>=0&&res.size()<k;i--){
            if(list[i]!=null){
                res.addAll(list[i]);
            }
        }
        
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}