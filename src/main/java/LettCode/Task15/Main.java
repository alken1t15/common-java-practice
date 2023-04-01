package LettCode.Task15;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,new ListNode(3,new ListNode(4)));
        ListNode listNode2 = new ListNode(1,new ListNode(2,new ListNode(4)));

        ListNode listNode1 = mergeTwoLists(listNode,listNode2);
        do {
            System.out.println( listNode1 = listNode1.next);
        } while (listNode1 != null);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;

        if(l1.val < l2.val)
        {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else
        {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
