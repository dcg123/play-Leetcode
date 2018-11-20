public class Solution86 {



    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 将链表中小于x的点放在x前面 保存原有顺序不变
     * Example:
     * <p>
     * Input: head = 1->4->3->2->5->2, x = 3
     * Output: 1->2->2->4->3->5
     *
     * @param args
     */
    public static void main(String[] args) {

    }


    public ListNode partition(ListNode head, int x) {
        if (head==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        ListNode newDummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy,p=newDummy;

        while (cur.next!=null){
            if (cur.next.val<x){
                p.next=cur.next;
                p=p.next;
                cur.next=cur.next.next;
                p.next=null;
            }else{
                cur=cur.next;
            }
        }
        p.next=dummy.next;
        return newDummy.next;
    }


}
