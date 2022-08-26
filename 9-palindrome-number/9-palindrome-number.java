class Solution {
    public boolean isPalindrome(int x) {
        //boolean a=false;
        int y=x;
     int rmainde=0,rev=0; 
         for(;y>0;)
         { 
            rmainde=y%10;
             rev=rev*10+rmainde;
             y=y/10;
         }
         if(rev==x)
        {
           return true;
        }
        return false;
    }
}