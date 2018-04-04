/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode pre = null;
        ListNode next = null;

        while(head!=null){
            //��ѭ���������ǰ�ڵ㲻Ϊ�յĻ���ʼ��ִ�д�ѭ������ѭ����Ŀ�ľ����õ�ǰ�ڵ��ָ��next��ָ��pre
            //��˾Ϳ���������ת�����Ч��
            //����next����head����һ���ڵ����Ϣ����֤����������Ϊʧȥhead�ڵ��ԭnext�ڵ���ʹ˶���
            next = head.next;
            //������next���Ϳ�����head��ָ��next���ָ��pre�ˣ���������
            head.next = pre;
            //headָ��pre�󣬾ͼ������η�ת��һ���ڵ�
            //��pre��head��next��������ƶ�һ���ڵ㣬������һ�ε�ָ�뷴ת
            pre = head;
            head = next;
        }
        //���headΪnull��ʱ��pre��Ϊ���һ���ڵ��ˣ����������Ѿ���ת��ϣ�pre���Ƿ�ת������ĵ�һ���ڵ�
        //ֱ�����pre����������Ҫ�õ��ķ�ת�������
        return pre;

    }
}