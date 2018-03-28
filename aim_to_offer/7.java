public class Solution {
    public int Fibonacci(int n) {
        int finOne = 0;
        int finTwo = 1;
        int finN = 0;
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        for(int i=2;i<=n;i++){
            finN = finTwo + finOne;
            finOne = finTwo;
            finTwo = finN;
            
            
        }

        return finN;
    }
}