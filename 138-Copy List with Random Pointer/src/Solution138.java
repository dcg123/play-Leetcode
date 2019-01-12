import java.util.HashMap;
import java.util.Map;

public class Solution138 {


    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }


    public static void main(String[] args) {

    }


    /**
     * 给定一个链表 每个节点指向下一个节点，和指向随机一个节点 复制这个链表
     */


    public RandomListNode copyRandomList(RandomListNode head) {
        if (head==null){
            return null;
        }

        Map<RandomListNode,RandomListNode> map=new HashMap<>();

        RandomListNode node =head;

        while (node!=null){
            map.put(node,new RandomListNode(node.label));
            node=node.next;
        }

        node=head;

        while (node!=null){
            map.get(node).next=map.get(node.next);
            map.get(node).random=map.get(node.random);
            node=node.next;
        }

        return map.get(head);
    }
}
