class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];

        int left=0;
        int right=n-1;
        int k=n-1;

        while(left<=right){
            int left_sq=nums[left]*nums[left];
            int right_sq=nums[right]*nums[right];

            if(left_sq>right_sq){
                res[k]=left_sq;
                left++;
            }
            else{
                res[k]=right_sq;
                right--;
            }
        k--;
        }
        return res;

    }
}