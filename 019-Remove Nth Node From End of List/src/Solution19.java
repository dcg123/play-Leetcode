public class Solution19 {



    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    /**
     * Given a linked list, remove the n-th node from the end of list and return its head.
     * @param args
     *
     * Given linked list: 1->2->3->4->5, and n = 2.
     *
     * After removing the second node from the end, the linked list becomes 1->2->3->5.
     */
    public static void main(String[] args) {

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode faster=head;
        ListNode slower=head;

        for (int i=0;i<n;i++){
            faster=faster.next;
        }

        if (faster==null){
            faster=head.next;
        }

        while (faster!=null){
            faster=faster.next;
            slower=slower.next;
        }

        slower.next=slower.next.next;

        return head;
    }

}
