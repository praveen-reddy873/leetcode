class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int []pre=new int[n+1];
        pre[0]=gain[0];
        for(int i=1;i<n;i++){
            pre[i]=gain[i]+pre[i-1];
        }
        pre[n]=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            if(pre[i]>max){
                max=pre[i];
            }
        }
        return max;
    }
}