/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
* 
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.Stack;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode n = listNode;
        Stack<Integer> s = new Stack<Integer>();
        ArrayList a = new ArrayList();
        
        while(n!=null){
            s.push(n.val);
            n = n.next;
        }
        while(!s.empty()){
            a.add(s.pop());
        }
        return a;
    }
}