public class Solution92 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        int headNodes=0;
        ListNode answer=head;
        ListNode pre=null;

        if (head==null||m>=n){
            return answer;
        }
        while (headNodes+1<m){
            pre=head;
            head=head.next;
            headNodes++;
        }

        ListNode kepeler=head;
        while (headNodes+1<n){
            kepeler=kepeler.next;
            headNodes++;
        }
        for (int i=0;i<n-m;i++){
            ListNode temp=head.next;
            head.next=kepeler.next;
            kepeler.next=head;
            head = temp;
        }
        if(pre == null)
            return kepeler;
        else{
            pre.next = kepeler;
            return answer;
        }
    }
}
