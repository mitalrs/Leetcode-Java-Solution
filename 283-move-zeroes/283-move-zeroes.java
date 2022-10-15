class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=0,temp=0;
        
        int n= nums.length;
        if(n==0 ||  n==1)
            return;
        
        while(r<n)
        {
            if(nums[r]==0)
            {
                r++;
            }
            else
            {
                temp=nums[l];
               nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r++;
            }
        }
    }
}