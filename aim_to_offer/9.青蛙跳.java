public class Solution {
    public int JumpFloorII(int target) {
        if(target==0)
            return 0;
        if(target==1)
            return 1;
        return 2*JumpFloorII(target-1);
    }
}
//�ȱ����У�����쳲���������(�Լ��������������ˣ����ǲ�Ҫ������������쳲��������ף���������ɶ����ɶ��)
//f(n)=2*f(n-1)