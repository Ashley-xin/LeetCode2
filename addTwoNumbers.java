package func1;

/*
给出两个非空的链表用来表示两个非负的整数。其中,它们各自的位数是按照逆序的
方式存储的，并且它们的每个节点只能存储一位数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

解题思路：curry 表示进位
首先创建一个新的链表用来存储相加的值 cur
       cur1 cur2分为指向两个链表
再者 用大循环确保走完两个链表
      判断cur1 cur2为空  为空返回零  否则返回其值   x  y
      将 curry 和x y 相加 赋值给sum
      sum大于10 sum/10赋值给curry
      sum%10 赋给创建的新节点
      cur1.next  cur2.next
 走完循环 看是否最后有进位
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class addTwoNumbers {
    public  ListNode addTwoNumbers (ListNode l1, ListNode l2) {
        ListNode newList = new ListNode(-1);//傀儡节点
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode cur = newList;
        int curry = 0;//表示进位
        while (cur1 != null || cur2 != null) {
            int x = cur1 != null ? cur1.val : 0;
            int y = cur2 != null ? cur2.val : 0;
            int sum = x + y + curry;
            curry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (cur1 != null) {
                cur1 = cur1.next;
            }
            if (cur2 != null) {
                cur2 = cur2.next;
            }
        }
        if (curry > 0) {
            cur.next = new ListNode(curry);
        }
        return newList.next;
    }
}
