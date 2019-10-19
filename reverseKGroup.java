package func1;
/*
给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
k 是一个正整数，它的值小于或等于链表的长度。
如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
示例 :
给定这个链表：1->2->3->4->5
当 k = 2 时，应当返回: 2->1->4->3->5
当 k = 3 时，应当返回: 3->2->1->4->5
说明 :
你的算法只能使用常数的额外空间。
你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换

基本思路：
实现大循环，利用while循环，当end== null，说明循环结束。在这里要确定开始
节点satrt，以及结束节点end 。
i < k，并且 end != null说明够 k个节点，需要去逆置这k个节点。
调用逆置函数。链表分为已逆置部分，和为逆置部分。
逆置部分和未逆置部分的衔接可以画图理解。

*/


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class reverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        ListNode prev = newHead;
        ListNode end = newHead;
        while (end != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = prev.next;
            ListNode next = end.next;//记录点
            end.next = null;
            prev.next = reverse(start);
            start.next = next;
            prev = start;
            end = prev;
        }
        return newHead.next;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
