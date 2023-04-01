package LettCode.Task20;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode1 = addTwoNumbers(listNode3, listNode4);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        do {
            int b = l1.val;
            stringBuilder.append(b);
            l1 = l1.next;
        } while (l1 != null);
        do {
            int b = l2.val;
            stringBuilder2.append(b);
            l2 = l2.next;
        } while (l2 != null);
        BigInteger bigInteger = new BigInteger(String.valueOf(stringBuilder2.reverse())).add(new BigInteger(String.valueOf(stringBuilder.reverse())));
        stringBuilder.setLength(0);
        stringBuilder.append(bigInteger).reverse();
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
    }
}