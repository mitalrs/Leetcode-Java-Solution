public class CountDigits {
    static int evenlyDivides(int N){
        // code here
        int rem=0, count=0, rev=0;
         int n=N;
        while(N!=0)
        {
            rem=N%10;
            // rev=rev*10+rem;
            N/=10;
            
            // System.out.println(rem/n);
            
            if(rem/n==0)
            {
                count++;
            }
        }
        //in rev have always the num i want
        return count;
    }
}
