class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int []left=new int[n];
        int []right=new int[n];
        left[0]=0;
        right[n-1]=0;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]+left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=nums[i+1]+right[i+1];
        }
        int []ans=new int[n];
        for(int i=0;i<n;i++){
            int diff=left[i]-right[i];
            if(diff<0){
                ans[i]=-1*diff;
            }
            else{
                ans[i]=diff;
            }
        }
        return ans;
    }
}