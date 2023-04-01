package LettCode.Task23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(1, new ListNode(2,new ListNode(1))));
        ListNode listNode3 = null;
       ListNode listNode2 = new ListNode();
        ListNode listNode1 =  reverseList3(listNode);
        do {
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        } while (listNode1 != null);
    }

/*    public static ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int b = head.val;
            stringBuilder.append(b);
            head = head.next;
        } while (head != null);

        stringBuilder.reverse();
        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        if(stringBuilder.length()==1){
            listNode.val = Integer.parseInt(String.valueOf(stringBuilder.charAt(0)));
            return listNode;
        }
        for (int i = 0; i < stringBuilder.length()-1; i++) {
            listNode1.val = Integer.parseInt(String.valueOf(stringBuilder.charAt(i)));
            ListNode listNode2 =new ListNode();
            listNode1.next = listNode2;
            listNode1 = listNode2;
            listNode1.val =  Integer.parseInt(String.valueOf(stringBuilder.charAt(i+1)));
        }
        return listNode;
    }*/

    public static ListNode reverseList(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(head==null){
            return null;
        }
        do {
            int b = head.val;
            arrayList.add(b);
            head = head.next;
        } while (head != null);

        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            listNode1.val = arrayList.get(i);
            if(i==0){
                break;
            }
            ListNode listNode2 =new ListNode();
            listNode1.next = listNode2;
            listNode1 = listNode2;
        }
        return listNode;
    }

    public static ListNode reverseList2(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(head==null){
            return null;
        }
        do {
            arrayList.add(head.val);
            head = head.next;
        } while (head != null);

        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            listNode1.val = arrayList.get(i);
            if(i==0){
                break;
            }
            ListNode listNode2 =new ListNode();
            listNode1.next = listNode2;
            listNode1 = listNode2;
        }
        return listNode;
    }

    public static ListNode reverseList3(ListNode head) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        if(head==null){
            return null;
        }
        int i = 1;
        do {
            hashMap.put(i,head.val);
            head = head.next;
            i++;
        } while (head != null);
        i--;
        ListNode listNode = new ListNode();
        ListNode listNode1 = listNode;
        while (i != 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if ((Integer) entry.getKey() == i) {
                    listNode1.val = (Integer) entry.getValue();
                    i--;
                    if (i == 0) {
                        break;
                    }
                    ListNode listNode2 = new ListNode();
                    listNode1.next = listNode2;
                    listNode1 = listNode2;
                }

            }
        }
        return listNode;
    }
}
