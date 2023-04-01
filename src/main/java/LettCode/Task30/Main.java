package LettCode.Task30;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1));
        ListNode listNode1 = deleteDuplicates(listNode);
        do {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        } while (listNode1 != null);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        do {
            int number = head.val;
            if(!arrayList.contains(number)){
                arrayList.add(number);
                arrayList2.add(number);
            }
            else if(arrayList2.contains(number)){
                arrayList2.remove((Integer) number);
            }
            head = head.next;
        } while (head != null);
        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        int b = 0;
        for (Integer integer : arrayList2) {
            if (b < 0) {
                ListNode listNode2 = new ListNode();
                listNode1.next = listNode2;
                listNode1 = listNode2;
            }
            listNode1.val = integer;
            b--;
        }
        if(arrayList2.size()==0){
            return null;
        }
        return listNode;
    }
}
