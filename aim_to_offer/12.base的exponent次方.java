import java.lang.Math;
public class Solution {
    public double Power(double base, int exponent) {
/**        if(exponent==0)
            return 1;
        if(base==0.0)
            return 0.0;
        double result = 1.0;
        if(exponent>0){
            for(int i=0;i<exponent;i++){
                result*=base;
            }
        }
        if(exponent<0){
            int i = -(exponent);
            for(int j=0;j<i;j++){
                result*=base;
            }
            result=1.0/result;
        }
        return result;
  }
}*/
        int e = Math.abs(exponent);
        if(e==0)
            return 1;
        if(e==1)
            return base;
        double result = Power(base,e>>1);//������������������2
        result*=result;
        if((e & 0x1)==1)                 //�������������������(%)���ж�һ��������������ż��
            result*=base;
        if(exponent<0)
          result = 1/result;  
        return result;
    }
}