package leetCode.linklist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeTest {

    ListNode root = new ListNode(1);;
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(1);
    @Test
    void deleteNode() {
    }

    @Test
    void removeNthFromEnd() {
        createNodes();
        DeleteNode dn = new DeleteNode();
        ListNode nthNode = dn.removeNthFromEnd(root, 2);
        assertEquals(1,root.val);
    }

    @Test
    void removeNthFromEnd_1() {
        createNodes_1();
        DeleteNode dn = new DeleteNode();
        ListNode nthNode = dn.removeNthFromEnd(root, 2);
        assertEquals(1,root.val);
    }

    @Test
    void removeNthFromEnd_2() {
        createNodes_root();
        DeleteNode dn = new DeleteNode();
        ListNode nthNode = dn.removeNthFromEnd(root, 1);
        assertNull(nthNode);
    }

    void createNodes(){
        ListNode head = root;
        for(int i = 2 ; i <= 5 ; i++){
            head.next = new ListNode(i);
            head = head.next;
        }
    }

    void createNodes_1(){
        ListNode head = root;
        for(int i = 2 ; i <= 2 ; i++){
            head.next = new ListNode(i);
            head = head.next;
        }
    }

    void createNodes_root(){
        ListNode head = root;
    }

    @Test
    void reverseList() {
        createNodes();
        DeleteNode dn = new DeleteNode();
        ListNode nthNode = dn.reverseList(root);
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