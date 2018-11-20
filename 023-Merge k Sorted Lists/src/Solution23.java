import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution23 {



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
     * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
     *
     * Example:
     *
     * Input:
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * Output: 1->1->2->3->4->4->5->6
     */



    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        if (lists.length==0){
            return null;
        }

        ListNode result=new ListNode(0);
        ListNode head=result;
        for (ListNode listNode:lists){
            ListNode temp=listNode;
            while (temp!=null){
                list.add(temp.val);
                temp=temp.next;
            }
        }

        Collections.sort(list);

        for (Integer val:list){
            ListNode temp=new ListNode(val);
            result.next=temp;
            result=result.next;
        }

        return head.next;
    }
}
