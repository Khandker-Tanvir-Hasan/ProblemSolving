package org.example.Solutions;
import java.util.*;
public class NodeDepths {
    public static int nodeDepthsRecursive(BinaryTree root) {
        int rootdepth = 0 ;
        return sumOfDepthRecursiveSolution(root, rootdepth);
    }

    public static int nodeDepthsNonRecursive(BinaryTree root){
        return sumOfDepthStackBasedNonRecursiveSolution(root);
    }

    public static int sumOfDepthRecursiveSolution(BinaryTree node, int currentDepth){
        if(node.left==null && node.right==null){return currentDepth;}
        int leftDepth = 0;
        int rightDepth = 0;
        if(node.left !=null) leftDepth = sumOfDepthRecursiveSolution(node.left, currentDepth+1);
        if(node.right!=null) rightDepth = sumOfDepthRecursiveSolution(node.right, currentDepth+1);
        return currentDepth+leftDepth+rightDepth;
    }

    public static int sumOfDepthStackBasedNonRecursiveSolution(BinaryTree root){
        List<BinaryTree> stack = new ArrayList<>();
        int sum = 0;
        BinaryTree node = root;
        stack.add(node);
        while(stack.size()>=1){
            if(node.left!=null){
                node=node.left;
                continue;
            }
            node = stack.get(stack.size()-1);
            node.left = null;
        }
        return sum;
    }

    public static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}