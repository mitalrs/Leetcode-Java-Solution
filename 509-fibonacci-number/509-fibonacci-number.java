class Solution {
    public int fib(int n) {
        int f3=0,f1=0,f2=1;
        
         if(n==0){
             return 0;
         }
        else if(n==1){
            return 1;
        }
        for(int i=0;i<n-1;i++)
        {
            //f+=i;
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
}