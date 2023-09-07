package org.example.Solutions;
import java.util.*;
public class BranchSum {
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;
        public BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
        public BinaryTree insert(List<Integer> values) {
            return insert(values, 0);
        }
        BinaryTree insert(List<Integer> values, int i) {
            if (i >= values.size()) return null;

            List<BinaryTree> queue = new ArrayList<BinaryTree>();
            queue.add(this);
            while (queue.size() > 0) {
                BinaryTree current = queue.get(0);
                queue.remove(0);
                if (current.left == null) {
                    current.left = new BinaryTree(values.get(i));
                    break;
                }
                queue.add((BinaryTree) current.left);
                if (current.right == null) {
                    current.right = new BinaryTree(values.get(i));
                    break;
                }
                queue.add((BinaryTree) current.right);
            }
            insert(values, i + 1);
            return this;
        }

    }
    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.

        return sumOfBranch(root, 0, new ArrayList<Integer>());
    }
    public static ArrayList<Integer> sumOfBranch(BinaryTree node, Integer sum, ArrayList<Integer> sums){
        if(node.left==null && node.right==null){
            sums.add(sum+node.value);
        }
        sum=sum+node.value;
        if(node.left!=null){
            sumOfBranch(node.left,sum,sums);
        }
        if(node.right!=null){
            sumOfBranch(node.right,sum,sums);
        }
        return sums;
    }
}

