class Solution {
    List<String> res = new ArrayList<>();
    char[] c;
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    public void dfs(int x){
        if(x==c.length-1){
            res.add(String.valueOf(c));
            return;
        }
        Set<Character> set = new HashSet<>();
        for(int i=x;i<c.length;i++){
            if(set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }

    public void swap(int i,int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}