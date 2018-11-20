public class Solution25 {




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
     * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
     * Example:
     *
     * Given this linked list:temp- 1->2->3->4->5
     *
     * For k = 2, you should return: 2->1->4->3->5
     *
     * For k = 3, you should return: 3->2->1->4->5
     * @param head
     * @param k
     * @return
     */

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode res = root;
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            i++;
            temp = temp.next;
        }
        while(i >= k){
            for(int j = 0 ; j < k-1; j++){
                ListNode node = root.next;
                root.next = head.next;
                head.next = root.next.next;
                root.next.next = node;
            }
            root = head;
            head = head.next;
            i-=k;
        }
        return res.next;
    }


}
