package org.example.Solutions;
import java.util.*;
public class BreathFirstSearch {
    public static class Node {

        String name;

        public List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            // Write your code here.
            Queue<Node> queue = new LinkedList<>();
            queue.add(this);
            HashSet<Node> myHashSet = new HashSet<>();
            while(!queue.isEmpty()){
                Node currentNode = queue.remove();
                for(int i=0; i<currentNode.children.size(); i++){
                    if(!myHashSet.contains(currentNode)){
                        queue.add(currentNode.children.get(i));
                    }
                }
                array.add(currentNode.name);
                myHashSet.add(currentNode);
            }
            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
