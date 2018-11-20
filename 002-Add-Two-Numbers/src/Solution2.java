
import java.util.*;


/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Solution2 {
    public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        if(l1 == null && l2 == null){
            return dummyHead;
        }
        int sum = 0, carry = 0;
        ListNode curr = dummyHead;
        while(l1!=null || l2!=null){
            int num1 = l1 == null? 0 : l1.val;
            int num2 = l2 == null? 0 : l2.val;
            sum = num1 + num2 + carry;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum / 10;
            l1 = l1 == null? null : l1.next;
            l2 = l2 == null? null : l2.next;
        }
        if(carry!=0){
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }



}
