class Solution {
    public int removeDuplicates(int[] nums) {
        int left=1,right=0;
        
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[right]!=nums[right+1])
            {
                nums[left]=nums[right+1];
                left++;
               
            }
             right++;
        }
        return left;
    }
}