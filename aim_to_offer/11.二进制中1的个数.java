//���Ʊ����Ƹ��ӡ����ƻ�Ҫ���Ƿ���λ������,������ֻҪĩβ��0
public class Solution {
    public int NumberOf1(int n) {
/**        int i = 1;
        int count = 0;
        while(i!=0){
            if((n&i)!=0)
               count++;
            i = i<<1;
        }
        return count;

    }
}*/
        int count = 0;
        if(n<0){
            n=n&(0x7FFFFFFF);
            count++;
        }
        while(n!=0){
            n = n&(n-1);
            ++count;
        }
        return count;
    }
}