package org.example.Solutions;
import java.util.*;
public class ReverseLinkedList {

    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList node = head.next;
        head.next = null;
        while(node!=null){
            LinkedList temp = node.next;
            node.next = head;
            head = node;
            node = temp;
        }
        return head;
    }

    public static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    public static LinkedList newLinkedList(int[] values) {
        LinkedList ll = new LinkedList(values[0]);
        LinkedList current = ll;
        for (int i = 1; i < values.length; i++) {
            current.next = new LinkedList(values[i]);
            current = current.next;
        }
        return ll;
    }

}
