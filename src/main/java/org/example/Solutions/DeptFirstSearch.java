package org.example.Solutions;
import java.util.*;
public class DeptFirstSearch {

    public static class Node {
        String name;
        public List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // Write your code here.
            HashSet<Node> visited = new HashSet<>();
            Node currentNode = this;
            Stack<Node> stack = new Stack<>();
            stack.push(currentNode);
            while(!stack.isEmpty()){
                currentNode = stack.pop();
                array.add(currentNode.name);
                visited.add(currentNode);
                for(int i=currentNode.children.size()-1; i>=0; i--){
                    if(!visited.contains(currentNode.children.get(i))){
                        stack.push(currentNode.children.get(i));
                    }
                }
            }

            return array;
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
        public Node addChild(Node node){
            children.add(node);
            return this;
        }
    }
}
