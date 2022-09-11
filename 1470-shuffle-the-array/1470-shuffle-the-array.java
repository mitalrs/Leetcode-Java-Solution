class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []a=new int[2*n];
            
            int l=0,r=n;
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[l];
            l++;
            i++;
            a[i]=nums[r];
            r++;
        }
        return a;
    }
}