package leetCode.linklist;


import leetCode.model.ListNode;

public class Palindrome {

    public boolean isPalindrome(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reverse(slow);
        fast = head;

        while(slow != null){
            if(slow.val != fast.val)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }


    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null)
        {
            if(fast.next == null)
                return false;
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return true;
        }
        return false;
    }
}
