/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//��ε�����ݽṹ���㷨2.11���ڹ鲢��������Ϊһ������ʱ������Ҫ���±�Ľڵ�ռ䣬��ֻ�轫ԭ�����������нڵ�֮��Ĺ�ϵ��������½����нڵ㰴�������ӳ�һ���������ɡ�
/**public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode pMergedHead = null;//��ListNode p=new ListNode()������ǰ��ֻ�ǽڵ�����ã������¿����˿ռ�
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