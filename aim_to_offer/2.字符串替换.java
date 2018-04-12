public class Solution {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
    	for(int i=0;i<c.length;i++){
            if(c[i]==' ')
                sb.append("%20");
            else
                sb.append(c[i]);
        }
        return sb.toString();
    }
}