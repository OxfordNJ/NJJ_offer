/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {                                  //head�ǵ�һ���ڵ���
    public ListNode FindKthToTail(ListNode head,int k) { //head������������ListNode
        if(head==null||k<=0)
            return null;                                 //Ҫ��֤�����³���ԣ���׳�ԣ�1��2
/**        int n = 0;
        for(ListNode x=head;x!=null;x=x.next){
            n++;
        }
        if(k>n)
            return null;
        for(int i=0;i<n-k;i++)
            head = head.next;                            //������k������������n-k+1���������±겻��n-k+1,����n-k!
        return head;

    }
}*/
                                                        //����ֻ�ñ���һ���أ��൱��������һ��K���ȵĳ��ӣ��ѳ��Ӵ�ͷ�����ƶ��������ӵ��Ҷ��������ĩβ�����ʱ�򣬳���������ڵĽ����ǵ�����k����㣡
        ListNode pre = head;
        ListNode p_Last = null;
        for(int i=0;i<k;i++){                           //³����3
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
}                                                       //���ɣ�Ҫ��ڼ����ڵ㣬pre�����߼����ڵ㡣