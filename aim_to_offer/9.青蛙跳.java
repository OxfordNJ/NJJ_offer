public class Solution {
    public int JumpFloorII(int target) {
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        return 2*JumpFloorII(target-1);
    }
}
//等比数列，不是斐波那契数列(自己分析出来规律了，但是不要刻意往上两题斐波那契上套，分析出来啥就是啥！)
//f(n)=2*f(n-1)