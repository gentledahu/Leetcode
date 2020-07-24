class Solution {
    public int maximumSwap(int num) {
        char[] c = String.valueOf(num).toCharArray();
        int[] last = new int[10];
        for(int i=0;i<c.length;i++){
            last[c[i]-'0'] = i;
        }
        for(int i=0;i<c.length;i++){
            for(int j=9;j>(c[i]-'0');j--){
                if(last[j]>i) {
                    char temp = c[i];
                    c[i] = c[last[j]];
                    c[last[j]] = temp;
                    return Integer.valueOf(new String(c));
                }
            }
        }
        return num;
    }
}