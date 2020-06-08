class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        // 构建一个大小为k的大顶堆，遍历一次数组为O(n),维护大顶堆为O(logk),
        // 时间复杂度为O(nlogk)
        if(arr.length==0||k==0) return new int[0];
        if(arr.length<=k) return arr;
        int[] res = new int[k];
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        
        for(int i=0;i<arr.length;i++){
            if(i<k){
                maxheap.add(arr[i]);
            }else {
                if(arr[i]<maxheap.peek()){
                    maxheap.poll();
                    maxheap.add(arr[i]);
                }
            }
        }

        for(int i=0;i<k;i++){
            res[i] = maxheap.poll();
        }
        return res;
    }

    //快排解法，时间复杂度为O(n)
    public int[] getLeastNumbers1(int[] arr, int k) {
        if(arr.length==0||k==0) return new int[0];
        if(arr.length<=k) return arr;
        int[] res = new int[k];
        partitionArray(arr,0,arr.length-1,k);
        for(int i=0;i<k;i++){
            res[i] = arr[i];
        }
        return res;
    }

    public void partitionArray(int[] a,int low,int high,int k){
        int m = partition(a,low,high);
        if(m==k) return ;
        else if(k>m){
            partitionArray(a,m+1,high,k);
        }else{
            partitionArray(a,low,m-1,k);
        }
    }

    public int partition(int[] a,int low,int high){
        int i = low;
        int j = high+1;
        int key = a[low];
        while(true){
            while(a[++i]<key){
                if(i==high) break;
            }
            while(a[--j]>key){
                if(j==low) break;
            }
            if(i>=j) break;
            swap(a,i,j);
        }
        swap(a,low,j);
        return j;
    }

    public void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}