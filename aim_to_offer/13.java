public class Solution {
    public void reOrderArray(int [] array) {
        if(array==null)
            return;
        int length = array.length;//����Ļ���array.length���ַ����Ļ���s.length()
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
        //��鲻��ֱ����array=res����Ϊ�漰��ֵ���ݸ����ô��ݡ�
        for(int i=0;i<count;i++){
            array[i] = res[i];
        }
        
    }
}