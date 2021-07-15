package leetCode.linklist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedListTest {

    ListNode root = new ListNode(1);;
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(1);

    @Test
    void mergeTwoLists() {
        createSortedList();
        createSortedList1();
        MergeSortedList dn = new MergeSortedList();
        ListNode result = dn.mergeTwoLists(node1, node2);
        assertTrue(true);
    }

    @Test
    void mergeTwoLists1() {
        MergeSortedList dn = new MergeSortedList();
        ListNode result = dn.mergeTwoLists(new ListNode(2), new ListNode(1));
        assertTrue(true);
    }

    void createSortedList(){
        ListNode head = node1;
        head.next = new ListNode(2);
        head = head.next;
        head.next = new ListNode(4);
    }

    void createSortedList1(){
        ListNode head = node2;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);
    }
}