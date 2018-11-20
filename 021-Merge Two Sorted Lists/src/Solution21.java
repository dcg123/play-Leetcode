public class Solution21 {



    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {

    }



    /**
     * Input: 1->2->4, 1->3->4
     * Output: 1->1->2->3->4->4
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode head=result;
        ListNode first=l1;
        ListNode second=l2;

        while (first!=null&&second!=null){
            if (first.val<second.val){
                ListNode temp=new ListNode(first.val);
                result.next=temp;
                result=result.next;
                first=first.next;
            }else{
                ListNode temp=new ListNode(second.val);
                result.next=temp;
                result=result.next;
                second=second.next;
            }
        }

        while (first!=null){
            ListNode temp=new ListNode(first.val);
            result.next=temp;
            result=result.next;
            first=first.next;
        }

        while (second!=null){
            ListNode temp=new ListNode(second.val);
            result.next=temp;
            result=result.next;
            second=second.next;
        }

        return head.next;

    }
}
