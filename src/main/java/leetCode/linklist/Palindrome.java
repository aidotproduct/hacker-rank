package leetCode.linklist;

public class Palindrome {

    public boolean isPalindrome(ListNode head)
    {
        if(head.val != head.next.val)
            isPalindrome(head.next);
        else
            return true;
        return true;
    }
}
