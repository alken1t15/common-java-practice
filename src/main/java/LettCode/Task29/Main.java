package LettCode.Task29;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2,new ListNode(1))));
        ListNode listNode2 = new ListNode();
       ListNode listNode1 = deleteDuplicates2(listNode);
        do {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        } while (listNode1 != null);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hashMap = new HashSet();
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        if(head==null){
            return null;
        }
        do {
            hashSet.add(head.val);
            head = head.next;
        } while (head != null);
       ListNode listNode = new ListNode();
       ListNode listNode1 = listNode;
       int b = 0;
        for (Integer integer : hashSet) {
            listNode1.val = integer;
            if (b == hashSet.size() - 1) {
                break;
            }
            ListNode listNode2 = new ListNode();
            listNode1.next = listNode2;
            listNode1 = listNode2;
            b++;
        }
        return listNode;
    }

    public static ListNode deleteDuplicates2(ListNode head) {
        HashSet<Integer> hashSet = new HashSet();
        if(head==null){
            return null;
        }
        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        int b = 0;
        do {
            if(hashSet.add(head.val)){
                if(b<0){
                    ListNode listNode2 = new ListNode();
                    listNode1.next = listNode2;
                    listNode1 = listNode2;
                }
                listNode1.val = head.val;
                b--;
                if(head.next==null){
                    break;
                }
            }
            head = head.next;
        } while (head != null);
        return listNode;
    }
}
