/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {                                  //head是第一个节点吗？
    public ListNode FindKthToTail(ListNode head,int k) { //head的引用类型是ListNode
        if(head==null||k<=0)
            return null;                                 //要保证代码的鲁棒性（健壮性）1、2
/**        int n = 0;
        for(ListNode x=head;x!=null;x=x.next){
            n++;
        }
        if(k>n)
            return null;
        for(int i=0;i<n-k;i++)
            head = head.next;                            //倒数第k个就是正数第n-k+1个。但是下标不是n-k+1,而是n-k!
        return head;

    }
}*/
                                                        //假如只让遍历一次呢？相当于制造了一个K长度的尺子，把尺子从头往后移动，当尺子的右端与链表的末尾对齐的时候，尺子左端所在的结点就是倒数第k个结点！
        ListNode pre = head;
        ListNode p_Last = null;
        for(int i=0;i<k;i++){                           //鲁棒性3
            if(pre!=null)
                pre = pre.next;
            else
                return null;
        }
        p_Last = head;
        while(pre!=null){
            pre = pre.next;
            p_Last = p_Last.next;
        }
        return p_Last;
    }
}                                                       //规律：要求第几个节点，pre就先走几个节点。