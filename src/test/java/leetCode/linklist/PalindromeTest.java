package leetCode.linklist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(2);
    ListNode node5 = new ListNode(1);
    ListNode root;

    Palindrome palindrome = new Palindrome();

    @Test
    public void isPalindromeTest() {
        createPalindrom1();
        boolean result = palindrome.isPalindrome(root);
        assertTrue(result);
    }

    @Test
    public void isPalindromeTest1() {
        createPalindrom2();
        boolean result = palindrome.isPalindrome(root);
        assertTrue(result);
    }

    void createPalindrom1(){
        root = head;
        head.next = node1;
        head = head.next;
        head.next = node2;
        head = head.next;
        head.next = node4;
        head = head.next;
        head.next = node5;
    }

    void createPalindrom2(){
        root = head;
        head.next = node1;
        head = head.next;
        head.next = node2;
        head = head.next;
        head.next = node3;
        head = head.next;
        head.next = node4;
        head = head.next;
        head.next = node5;
    }

}