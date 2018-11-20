public class Solution24 {

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
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     * @param head
     * @return
     */

    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }


        ListNode result=new ListNode(0);
        ListNode temp=head;

        int count=0;
//        while (head!=null){
//            ListNode temp=
//        }
        return null;
    }


}
