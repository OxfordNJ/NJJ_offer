public class Solution {
    public int JumpFloor(int target) {
        int step_0 = 1;
        int step_1 = 1;
        if(target == step_0)
            return 1;
        if(target == step_1)
            return 1;
        int step_n = 1 ;
        
        for(int i=2;i<=target;i++){
            step_n = step_1+step_0;
            step_0 = step_1;
            step_1 = step_n;
        }
        return step_n;

    }
}