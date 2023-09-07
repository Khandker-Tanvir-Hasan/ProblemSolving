package org.example.Solutions;
import java.util.*;
public class RemoveDuplicatesFromLinkedList {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }

        public static LinkedList addMany(LinkedList ll, List<Integer> values) {
            LinkedList current = ll;
            while (current.next != null) {
                current = current.next;
            }
            for (int value : values) {
                current.next = new LinkedList(value);
                current = current.next;
            }
            return ll;
        }

        public List<Integer> getNodesInArray(LinkedList ll) {
            List<Integer> nodes = new ArrayList<Integer>();
            LinkedList current = ll;
            while (current != null) {
                nodes.add(current.value);
                current = current.next;
            }
            return nodes;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        LinkedList head = linkedList;
        while(linkedList!=null){
            while( linkedList.next!=null && linkedList.next.value == linkedList.value){
                linkedList.next= linkedList.next.next;
            }
            linkedList = linkedList.next;
        }
        return head;
    }
}
