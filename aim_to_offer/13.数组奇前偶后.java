public class Solution {
    public void reOrderArray(int [] array) {
        if(array==null)
            return;
        int length = array.length;//数组的话是array.length，字符串的话是s.length()
        if(length==0)
            return;
        int[] res = new int[length];
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                res[count]=array[i];
                count++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                res[count]=array[i];
                count++;
            }
                
        }
        //这块不能直接用array=res，因为涉及到值传递跟引用传递。
        for(int i=0;i<count;i++){
            array[i] = res[i];
        }
        
    }
}