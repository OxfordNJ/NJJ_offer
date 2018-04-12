/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//严蔚敏数据结构（算法2.11）在归并两个链表为一个链表时，不需要另建新表的节点空间，而只需将原来两个链表中节点之间的关系解除，重新将所有节点按需求链接成一个新链表即可。
/**public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode pMergedHead = null;//与ListNode p=new ListNode()的区别：前者只是节点的引用，后者新开辟了空间
        if(list1.val<list2.val){
            pMergedHead = list1;
            pMergedHead.next = Merge(list1.next,list2);
        }
        else{
            pMergedHead = list2;
            pMergedHead.next = Merge(list1,list2.next);
        }
        return pMergedHead;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode pMergedHead = null;
        
        if(list1.val<list2.val){
        	pMergedHead = list1;
        	list1 = list1.next;
        	}
        else{
        	pMergedHead = list2;
        	list2 = list2.next;
        	}
        ListNode tem = pMergedHead;
        while(list1!=null&&list2!=null){
        	if(list1.val<list2.val){
        		tem.next = list1;
        		tem = tem.next;
        		list1 = list1.next;
        	}
        	else{
        		tem.next = list2;
        		tem = tem.next;
        		list2 = list2.next;
        	}
        }
        if(list1!=null){
        	tem.next = list1;
        }
        if(list2!=null){
        	tem.next = list2;
        }
    	return pMergedHead;
    }
}