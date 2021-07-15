package leetCode.linklist;

public class MergeSortedList {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode first, second, result, temp;
        if (l1.val > l2.val) {
            first = l1;
            second = l2;
            result = l1;
        } else {
            first = l2;
            second = l1;
            result = l2;
        }

        while (first.next != null) {
            if (second != null && first.next.val >= second.val) {
                temp = second.next;
                second.next = first.next;
                first.next = second;
                first = second;
                second = temp;
            } else
                first = first.next;
        }
        first.next = second;

        return result;
    }

}
