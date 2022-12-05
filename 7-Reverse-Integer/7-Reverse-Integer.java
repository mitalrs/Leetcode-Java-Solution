class Solution {
    public int reverse(int x) {
        int rem=0;
        long rev=0;
        boolean nag = false;
        
        if(x<0){
            nag = true;
            x=-1*x;
        }
        
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(nag) {
            rev= -1*rev;
        }
       return (int)rev;
    }
}
//1 534 236 469   	2,147,483,648  ...... -2 147 483 648
